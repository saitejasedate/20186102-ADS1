import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfrecords = Integer.parseInt(sc.nextLine());
		BST<Double, Student> bst = new BST<Double, Student>();
		int count = 0;
		while (count < numOfrecords) {
			String[] str = sc.nextLine().split(",");
			Student st = new Student(Integer.parseInt(str[0]), str[1], Double.parseDouble(str[2]));
			bst.put(Double.parseDouble(str[2]), st);
			count++;
		}
		// for (Double s : bst.keys()) {
		// 	System.out.println(bst.get(s));
		// }
		int numOfqueries = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numOfqueries; i++) {
			int query = Integer.parseInt(sc.nextLine());
			for (Double s : bst.keys()) {
				if (query == s) {
					System.out.println(bst.get(s));
				}
			}
		}
	}
}