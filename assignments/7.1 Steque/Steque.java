/**
 * Class for steque.
 */
class Steque {
	private Node start = null;
	private Node end = null;
class Node {
	private String data;
	private Node next;
	Node (String data)  {
		this.data = data;
		this.next = null;
	}
}
public void push(String item) {
	Node newNode = new Node(item);
	if (start == null) {
		end = newNode;
	}
	newNode.next = start;
	start = newNode;
}
public void enqueue(String item) {
	Node newNode = new Node(item);
	if (start == null) {
		start = newNode;
		end = newNode;
	} else {
		end.next = newNode;
		end = newNode;
	}
}
public void pop() {
	if (start!=null) {
		start = start.next;
	}
	if (end != null) {
		end = end.next;
	}
}
public String toString() {
	String str = "";
	Node temp = start;
	if (temp == null) {
		return "Steque is Empty";
	}
	while (temp.next != null) {
        str += temp.data + "," + " ";
        temp = temp.next;
    }
    str += temp.data;
    return str;
}
}


 