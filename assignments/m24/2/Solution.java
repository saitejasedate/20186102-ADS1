import java.util.*;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BST<Double, Student> bst = new BST<Double, Student>();
		int num = Integer.parseInt(sc.nextLine());
		int count = 0;
		while (count < num) {
			String[] str = sc.nextLine().split(",");
			Student std = new Student(Integer.parseInt(str[0]), str[1], Double.parseDouble(str[2]));
			bst.put(Double.parseDouble(str[2]), std);
			count++;
		}
		int queries = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < queries; i++) {
			String[] arr = sc.nextLine().split(" ");
			switch("arr[0]") {
				case"BE":
				for (Double j = Double.parseDouble(arr[1]); j <= Double.parseDouble(arr[2]); j++) {
					System.out.println(bst.get(j));
				}
				break;
				case"LE":
				for (Double j = Double.parseDouble(arr[1]); j >= 0; j--) {
					System.out.println(bst.get(j));
				}
				break;
				case"GE":
				for (Double j = Double.parseDouble(arr[1]); j <= bst.size(); j++) {
					System.out.println(bst.get(j));
				}
				break;
				default:
				break;
			}
		}
	}
}