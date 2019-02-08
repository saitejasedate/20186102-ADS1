import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfrecords = Integer.parseInt(sc.nextLine());
		BST<String, Student> bst = new BST<String, Student>();
		LinearProbingHashST<String, Student> lst = new LinearProbingHashST<String, Student>();
		int count = 0;
		while (count < numOfrecords) {
			String[] str = sc.nextLine().split(",");
			Student st = new Student(Integer.parseInt(str[0]), str[1], Double.parseDouble(str[2]));
			if (bst.contains((str[1]))) {
				lst.put((str[1]), st);
			} else {
				bst.put((str[1]), st);
			}
			count++;
		}
		// System.out.println("-----------------------------");
		// for (int s : bst.keys()) {
		// 	System.out.println(s + ", "+ bst.get(s));
		// }
		// System.out.println("--------------------------------");
		// for (int s : bst.keys()) {
		// 	System.out.println(s + ", "+ lst.get(s));
		// }
		// System.out.println("-------------------------------");
		int numOfqueries = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numOfqueries; i++) {
			String query = sc.nextLine();
			for (String s : bst.keys()) {
				if (bst.get(s).getmarks() == Integer.parseInt(query)) {
					System.out.println(bst.get(s));
				}
				if (lst.get(s).getmarks() == Integer.parseInt(query)) {
					System.out.println(lst.get(s));
				}
			}
		}
	}
}