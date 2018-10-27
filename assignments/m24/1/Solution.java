import java.util.Scanner;
public class Solution {
private Solution() {
}
public static void main(final String[] args) {
  Scanner scan = new Scanner(System.in);
  int numOfStudentRecords = Integer.parseInt(scan.nextLine());
  LinearProbingHashST<Integer, Student> lph = new LinearProbingHashST<>();
  for (int i = 0; i < numOfStudentRecords; i++) {
    String[] str = scan.nextLine().split(",");
    Student stuobj = new Student(Integer.parseInt(str[0]), str[1], Double.parseDouble(str[2]));
    lph.put(Integer.parseInt(str[0]), stuobj);
  }
  int queries = Integer.parseInt(scan.nextLine());
  for (int j = 0; j < queries; j++) {
    String[] tokens = scan.nextLine().split(" ");
    switch (tokens[2]) {
    case "1":
        System.out.println("Student doesn't exists...");
      break;
    case "2":
        System.out.println("Student doesn't exists...");
      break;
      default:
      break;
    }
  }
}
}

