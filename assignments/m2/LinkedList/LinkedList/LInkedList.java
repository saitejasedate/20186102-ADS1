 /**
  * @author : saitejasedate.
  */
 /**
  * List of linkeds.
  */
 class LinkedList {
    private int size;
    private Node start;
    LinkedList() {
        this.size = 0;
        this.start = null;
    }
    /**
     * size of the linked list.
     *
     * @return     { return size }.
     */
    public int size() {
        return size;
    }
    /**
     * Pushes a right.
     *
     * @param      data  The data
     */
    public void pushRight(int data) {
        if (start == null) {
            Node newNode = new Node(data);
            start = newNode;
        }
        else {
            Node temp = start;
            Node newNode = new Node(data);
            while (temp.getNextNode() != null) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(newNode);
        }
        size++;
    }
    /**
     * Pushes a left.
     *
     * @param      data  The data
     */
    public void pushLeft(int data) {
        Node newnode = new Node(data);
        newnode.setNextNode(start);
        start = newnode;
        size++;
    }
    /**
     * Removes a left.
     */
    public void removeLeft() {
        if (start != null) {
            start = start.getNextNode();
            size--;
        } else {
            System.out.println("No nodes to remove");
        }
    }
    /**
     * Removes the given data from linked list.
     *
     * @param      data  The data
     */
    public void remove(int data) {
        Node temp1 = start;
        if(temp1.getData() == data) {
            temp1 = temp1.getNextNode();
            start = temp1;
        } else {
            while(temp1.getNextNode().getNextNode()!= null) {
                if(temp1.getNextNode().getData() == data) {
                    break;
                }
                temp1 = temp1.getNextNode();
            }
            if(temp1.getNextNode().getData() == data) {
                temp1.setNextNode(temp1.getNextNode().getNextNode());
            }
        }
        size--;
    }
    /**
     * removes the left node and updates the new start.
     */
    public void popLeft() {
        if (start != null) {
            start = start.getNextNode();
            size--;
        } else {
            System.out.println("No nodes to remove");
        }
    }
    /**
     * Removes a right.
     */
    public void removeRight() {
        if (start == null) {
            System.out.println("No nodes to remove");
        } else if (size < 2) {
            start = null;
            size--;
        } else {
            Node temp = start;
            while (temp.getNextNode().getNextNode() !=null) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(null);
            size--;
        }
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String s = "";
        Node temp = start;
        if (temp == null) {
            return "Empty linked list";
        }
        while (temp.getNextNode() != null) {
            s += temp.getData() + ", ";
            temp = temp.getNextNode();
        }
        s += temp.getData();
        return s;
    }
}
