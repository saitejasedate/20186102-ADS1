/**
 * @author : saitejasedate.
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * main function to take the input and call the functions.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int size = 0;
        while (sc.hasNextLine()) {
            String[] tokens = sc.nextLine().split(" ");
            switch (tokens[0]) {
            case "insertAt":
                if (!ll.insertAt(Integer.parseInt(tokens[1]),
                    Integer.parseInt(tokens[2]))) {
                    size++;
                    System.out.println(ll.print());
                }
                break;
            case "reverse":
                if (size == 0) {
                    System.out.println("No elements to reverse.");
                    break;
                }
                ll.reverse();
                System.out.println(ll.print());
                break;
            default:
                break;
            }
        }
    }
}
