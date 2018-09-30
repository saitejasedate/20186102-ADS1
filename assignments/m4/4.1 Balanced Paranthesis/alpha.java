class LinkedList<E> {
	int size;
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
		Node head = null;
		Node newNode = new Node(data);
		if(size++ == 0) {
			head = newNode;
			return;
		}
		Node temp = head;
		for(int i = 0; i < size - 1; i++) {
			temp = temp.next;
		}

		temp.next = newNode;
		return;
	}
}