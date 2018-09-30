class LinkedList<E> {
	int size;
	Node head = null;

	LinkedList() {
		size = 0;
	}
	class Node<E> {
		E data;
		Node next = null;
		Node(E data) {
			this.data = data;
		}
	}
	void add(int pos, E data) {
		Node newNode = new Node(data);
		if(size == 0) {
			head = newNode;
			size++;
			return;
		}
		Node temp = head;
		for(int i = 0; i < pos - 1; i++) {
			temp = temp.next;
		}
		temp.next = newNode;
		size++;
		return;
	}
	void remove() {
		Node temp = head;
		for(int  i= 0; i < size - 2;i++ )
			temp = temp.next;
		temp.next = null;
		// return temp.data;
	}
	void print() {
		Node temp = head;
		for(int i = 0; i < size; i++) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}