import java.util.*;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfdataRecords = Integer.parseInt(sc.nextLine());
		BST<Double, Student> bst = new BST<Double, Student>();
		for (int i = 0; i < numOfdataRecords; i++) {
			String[] arr = sc.nextLine().split(",");
			Student obj = new Student(Integer.parseInt(arr[0]), arr[1], Double.parseDouble(arr[2]));
			bst.put(Double.parseDouble(arr[2]), obj);
		}
		int numOfqueries = Integer.parseInt(sc.nextLine());
		for (int j = 0; j < numOfqueries; j++) {
			String[] arr1 = sc.nextLine().split(" ");
			int n = 0;
			switch (arr1[0]) {
				case "BE":
				System.out.println(bst.size());
				try {
					for (double k = 0; k < bst.size(); k++) {
						if ((bst.get(k)).getmarks() >= Double.parseDouble(arr1[1]))  {
							System.out.println((bst.get(k)).getstudentname());
						}
					}
				} 	catch (Exception e) {
					System.out.println("o");
				}
				case "GE":
				case "LE":
			}
		}
	}
}