import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfrecords = Integer.parseInt(sc.nextLine());
		BST<Integer, Student> bst = new BST<Integer, Student>();
		LinearProbingHashST<Integer, Student> lst = new LinearProbingHashST<Integer, Student>();
		int count = 0;
		Student[] students = new Student[numOfrecords];
		while (count < numOfrecords) {
			String[] str = sc.nextLine().split(",");
			Student st = new Student(Integer.parseInt(str[0]), str[1], Double.parseDouble(str[2]));
			students[count] = st;
			count++;
		}
		Insertion.sort(students);
		int numOfqueries = Integer.parseInt(sc.nextLine());
		int c = 0;
		for (int i = 0; i < numOfqueries; i++) {
			String query = sc.nextLine();
			for (Student st : students) {
				if (st.getmarks() == Double.parseDouble(query)) {
					System.out.println(st);
				}
				else {
					c++;
				} 
			}
		}
		if (c > 1) {
			System.out.println("This marks are not awarded to any student");
		}
	}
}