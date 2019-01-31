import java.util.*;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BST<Double, Student> bst = new BST<Double, Student>();
		LinearProbingHashST<Double, Student> lst = new LinearProbingHashST<Double, Student>();
		int num = Integer.parseInt(sc.nextLine());
		int count = 0;
		while (count < num) {
			String[] str = sc.nextLine().split(",");
			Student std = new Student(Integer.parseInt(str[0]), str[1], Double.parseDouble(str[2]));
			bst.put(Double.parseDouble(str[2]), std);
			// lst.put(Double.parseDouble(str[2]), std);
			count++;
		}
		// System.out.println("--------------------------------------------------");
		// for (Double s : bst.keys()) {
		// 	System.out.println(s + " " + bst.get(s));
  //           // StdOut.println(s + " " + bst.get(s));
		// }
		// System.out.println(bst.size());
		// System.out.println("---------------------------------------------------");
		// for (Double s : bst.keys()) {
		// 	System.out.println(s + " " + lst.get(s));
		// }
		int queries = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < queries; i++) {
			String[] arr = sc.nextLine().split(" ");
			switch(arr[0]) { 
				case"BE":
				for (Double s : bst.keys()) {
					if (s >= Double.parseDouble(arr[1]) && s <= Double.parseDouble(arr[2])) {
						System.out.println(bst.get(s).getname());
					}
				}			
				break;
				case"LE":
				for (Double s : bst.keys()) {
					if (s <= Double.parseDouble(arr[1])) {
						System.out.println(bst.get(s).getname());
					}
				}
				break;
				case"GE":
				for (Double s : bst.keys()) {
					if (s >= Double.parseDouble(arr[1])) {
						System.out.println(bst.get(s).getname());
					}
				}
				break;
				default:
				break;
			}
		}
	}
}