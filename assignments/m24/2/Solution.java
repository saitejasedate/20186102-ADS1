import java.util.*;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfdataRecords = Integer.parseInt(sc.nextLine());
		BST<Integer, Student> bst = new BST<Integer, Student>();
		for (int i = 0; i < numOfdataRecords; i++) {
			String[] arr = sc.nextLine().split(",");
			Student obj = new Student(Integer.parseInt(arr[0]), arr[1], Double.parseDouble(arr[2]));
			bst.put(Integer.parseInt(arr[2]), obj);
		}
		int numOfqueries = Integer.parseInt(sc.nextLine());
		for (int j = 0; j < numOfqueries; j++) {
			String[] arr1 = sc.nextLine().split(" ");
			switch (arr1[0]) {
				case "BE":
				for (int k = Integer.parseInt(arr1[1]); k <= Integer.parseInt(arr1[2]); k++) {
					System.out.println(bst.get(Integer.parseInt(arr1[k])).getstudentname());
				}
				case "GE":
				case "LE":
			}
		}
	}
}