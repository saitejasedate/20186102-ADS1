import java.util.*;
class Node {
	private String data;
	private Node nextNode;
	Node(String data) {
		this.data = data;
		this.nextNode = null;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}	
}
class LinkedList {
    private int size;
    private Node start;
    LinkedList() {
        this.size = 0;
        this.start = null;
    }
    public int size() {
        return size;
    }
    public void pushRight(String data) {
        if (start == null) {
            Node newNode = new Node(data);
            start = newNode;
        }
        else {
            Node temp = start;
      	}
    }

    public void removeLeft() {
        if (start != null) {
            start = start.getNextNode();
            size--;
        } else {
            System.out.println("No nodes to remove");
        }
    }
    public void removeRight() {
        if (start == null) {
            System.out.println("No nodes to remove");
        }else if (size < 2) {
            start = null;
            size--;
        }else {
            Node temp = start;
            while (temp.getNextNode().getNextNode() !=null) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(null);
            size--;
        }
    }
    public String toString() {
        String s = "";
        Node temp = start;
        if (temp == null) {
            return "Empty NextNodeed list";
        }
        while (temp.getNextNode() != null) {
            s += temp.getData() + ", ";
            temp = temp.getNextNode();
        }
        s += temp.getData();
        return s;
    }
}

class AddLargeNumbers {
    
    public static LinkedList numberToDigits(String number) {
    	LinkedList list = new LinkedList(); 
    	String[] a = new String[] {number};
    	for (int i = 0; i < a.length; i++) {
    		list.pushRight(a[i]);
    	}
    	return list;
    }

    public static String digitsToNumber(LinkedList list) {
    	// String number = "";
    	// for (int i = 0; i < list.size(); i++) {
    	// 	number = number + list.removeRight();
    	// }
    }return;


    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {

    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
