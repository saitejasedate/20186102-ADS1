/**
 * Class for node.
 */
class Node {
    int data;
    Node next;
    Node(int value) {
        data = value;
        next = null;
    }
    public Node getAddress() {
        return next;
    }
    public void setAddress(Node address) {
        next = address;
    }

    public void setdata(int data1) {
        data = data1;
    }
}