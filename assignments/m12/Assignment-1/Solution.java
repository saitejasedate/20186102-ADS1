/**
 * import Scanner class
 */
import java.util.Scanner;
/**
 * @author : saitejasedate.
 */
final class Solution {
    /**
     * Solution class for Insertion sort program.
     *
     */
    private Solution() {
        /**
         * { item_description }.
         */
    }
    /**
     * Main function to take inputs.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
    /**main method converts the given input data into
    array objects and pass as parameters to the sorting class.**/
        final int three = 3;
        Scanner sc = new Scanner(System.in);
        int studentsQualified = sc.nextInt();
        int numOfvacancies = sc.nextInt();
        int unreserved_vacancies = sc.nextInt();
        int bc_vacancies = sc.nextInt();
        int sch_vacancies = sc.nextInt();
        int sct_vacancies = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        while (sc.hasNext()) {
            sb.append(sc.nextLine() + "::");
        }
        String[] lines = sb.toString().split("::");
        int i = 0;
        Student[] students = new Student[lines.length];
        for (String line : lines) {
            String[] tokens = line.split(",");
            Student student = new Student(tokens[0], tokens[1],
                Integer.parseInt(tokens[2]), Integer.parseInt(tokens[three]),
                Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]), 
                tokens[6]);
            students[i++] = student;
        }
        Insertion.sort(students);
        String output = "";
        for (Student student : students) {
            output += student + ",";
        }
        System.out.print(output.substring(0, output.length() - 1));
    }
}
