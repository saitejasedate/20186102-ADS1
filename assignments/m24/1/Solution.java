/**
 * @author : saitejasedate.
 */
/**
 * import Scanner class.
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
/**
 * Constructs the object.
 */
private Solution() {
  /**
   * Empty constructor.
   */
}
public static void main(final String[] args) {
  Scanner scan = new Scanner(System.in);
  int numOfStudentRecords = Integer.parseInt(scan.nextLine());
  LinearProbingHashST<Integer, Student> lph = new LinearProbingHashST<>(3 * numOfStudentRecords);
  for (int i = 0; i < numOfStudentRecords; i++) {
    String[] str = scan.nextLine().split(",");
    System.out.println(str);
    Student stuobj = new Student(Integer.parseInt(str[0]),str[1],Double.parseDouble(str[2]));
    lph.put(Integer.parseInt(str[0]), stuobj);
  }
  int queries = Integer.parseInt(scan.nextLine());
  for (int j = 0; j < queries; j++) {
    String[] tokens = scan.nextLine().split(" ");
    switch (tokens[2]) {
    case "1":
      try {
        System.out.println(lph.get(Integer.parseInt(tokens[1])).getName());
      } catch (Exception e) {
        System.out.println("Student doesn't exists...");
      }
      break;
    case "2":
      try {
        System.out.println(lph.get(
                             Integer.parseInt(tokens[1])).getMarks());
      } catch (Exception e) {
        System.out.println("Student doesn't exists...");
      }
      break;
      default:
      break;
    }
  }
}
}
