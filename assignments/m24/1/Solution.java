import java.util.*;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfdataRecords = Integer.parseInt(sc.nextLine());
		SeparateChainingHashST<Integer, Student> st = new SeparateChainingHashST<Integer, Student>();
		for (int i = 0; i < numOfdataRecords; i++) {
			String[] str = sc.nextLine().split(",");
			Student obj = new Student(Integer.parseInt(str[0]), str[1], Double.parseDouble(str[2]));
			st.put(Integer.parseInt(str[0]), obj);
		}
		int queries = Integer.parseInt(sc.nextLine());
		for (int j = 0; j < queries; j++) {
			String[] str1 = sc.nextLine().split(",");
			switch (str1[2]) {
				case "1":
				try {
					System.out.println(st.get(Integer.parseInt(str1[1])).getName());
				} catch (Exception e) {
					System.out.println("Student doesn't exist");
				}
				break;
				case "2":
				try {
					System.out.println(st.get(Integer.parseInt(str1[1])).getMarks());
				} catch (Exception e) {
					System.out.println("Student doesn't exist");
				}
				break;
				default:
				break;
			} 
		}
	}
}