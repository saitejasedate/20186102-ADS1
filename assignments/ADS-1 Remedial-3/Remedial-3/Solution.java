import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfrecords = Integer.parseInt(sc.nextLine());
		int count = 0;
		Student[] students = new Student[numOfrecords];
		while (count < numOfrecords) {
			String[] str = sc.nextLine().split(",");
			Student st = new Student(Integer.parseInt(str[0]), str[1], Double.parseDouble(str[2]));
			students[count] = st;
			count++;
		}
		Insertion.sort(students);
		for (Student st : students) {
			System.out.println(st);
		}
		System.out.println("-----------------------------");
		int numOfqueries = Integer.parseInt(sc.nextLine());
		// int temp = 0;
		int start = 0;
		for (int i = 0; i < numOfqueries; i++) {
			String query = sc.nextLine();
			// for (Student st : students) {
			// 	if (st.getmarks() == Double.parseDouble(query)) {
			// 		System.out.println(st);
			// 	}
			// }
			int end = 0;
			if (Double.parseDouble(query) <= students[students.length/2].getmarks()) {
				for (int j = students.length/2; j >= 0; j--) {
					if (students[j].getmarks() == Double.parseDouble(query)) {
						System.out.println(students[j]);
					}
				}
			}
			else {
				for (int j = students.length/2+1; j < students.length; j++) {
					if (students[j].getmarks() == Double.parseDouble(query)) {
						System.out.println(students[j]);
					}
				}
			}
		}
	}
}