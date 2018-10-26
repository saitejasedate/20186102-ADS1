/**
 * @author : saitejasedate.
 */
/**
 * Class for steque.
 */
class Steque {
	/**
	 * Node start.
	 */
	private Node start = null;
	/**
	 * Node end.
	 */
	private Node end = null;
/**
 * Class for node.
 */
class Node {
	/**
	 * String data in a node.
	 */
	private String data;
	/**
	 * link for the next node.
	 */
	private Node next;
	/**
	 * Constructs the object.
	 *
	 * @param      data1  The data
	 */
	Node(final String data1)  {
		this.data = data1;
		this.next = null;
	}
}
/**
 * add item to the left of steque.
 * time complexity is constant.
 *
 * @param      item  The item
 */
public void push(final String item) {
	Node newNode = new Node(item);
	if (start == null) {
		end = newNode;
	}
	newNode.next = start;
	start = newNode;
}
/**
 * add item to the right of steque.
 * time complexity is constant.
 * @param      item  The item
 */
public void enqueue(final String item) {
	if (start == null) {
		Node newNode = new Node(item);
		start = newNode;
		end = newNode;
	} else {
		Node newNode1 = new Node(item);
		end.next = newNode1;
		end = newNode1;
	}
}
/**
 * remove the top most element.
 * time complexity is constant.
 */
public void pop() {
	if (start != null) {
		start = start.next;
	}
	if (end != null) {
		end = end.next;
	}
}
/**
 * Returns a string representation of the object.
 *
 * @return     String representation of the object.
 */
public String toString() {
	String str = "";
	Node temp = start;
	if (temp == null) {
		return "Steque is empty.";
	}
	while (temp.next != null) {
        str += temp.data + "," + " ";
        temp = temp.next;
    }
    str += temp.data;
    return str;
}
}
