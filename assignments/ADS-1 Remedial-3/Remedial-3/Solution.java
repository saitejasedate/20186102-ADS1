import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfrecords = Integer.parseInt(sc.nextLine());
		int count = 0;
		BinarySearch bs = new BinarySearch();
		Student[] students = new Student[numOfrecords];
		Double[] data = new Double[numOfrecords];
		while (count < numOfrecords) {
			String[] str = sc.nextLine().split(",");
			Student st = new Student(Integer.parseInt(str[0]), str[1], Double.parseDouble(str[2]));
			students[count] = st;
			count++;
		}
		Insertion.sort(students);
		// System.out.println("----------------------------");
		// for (Student st : students) {
		// 	System.out.println(st);
		// }
		// System.out.println("-----------------------------");
		int numOfqueries = Integer.parseInt(sc.nextLine());
		for (int j = 0; j < students.length; j++) {
			data[j] = students[j].getmarks();
		}
		for (int i = 0; i < numOfqueries; i++) {
			String query = sc.nextLine();
			int pos = bs.indexOf(data, Double.parseDouble(query));
			int temp = pos;
			// System.out.println(temp);
			while (pos >= 0 && students[pos].getmarks() == Double.parseDouble(query)) {
				pos--;
			}
			int start = pos+1;
			while (temp < students.length && students[temp].getmarks() == Double.parseDouble(query)) {
				temp++;
			}
			int end = temp - 1;
			for (int k = start; k <= end; k++) {
				System.out.println(students[k]);
			}
		}
	}
}