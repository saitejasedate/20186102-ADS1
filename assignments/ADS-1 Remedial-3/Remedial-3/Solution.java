import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfrecords = Integer.parseInt(sc.nextLine());
		BST<Integer, Student> bst = new BST<Integer, Student>();
		LinearProbingHashST<Integer, Student> lst = new LinearProbingHashST<Integer, Student>();
		int count = 0;
		while (count < numOfrecords) {
			String[] str = sc.nextLine().split(",");
			Student st = new Student(Integer.parseInt(str[0]), str[1], Double.parseDouble(str[2]));
			if (bst.contains(Integer.parseInt(str[0]))) {
				lst.put(Integer.parseInt(str[0]), st);
			} else {
				bst.put(Integer.parseInt(str[0]), st);
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
			int query = sc.nextInt();
			for (int s : bst.keys()) {
				if (bst.get(s).getmarks() == query) {
					System.out.println(bst.get(s));
				}
				if (lst.contains(s)) {
					if (bst.get(s).getmarks() == query) {
						System.out.println(lst.get(s));
					}
				}
			}
		}
	}
}