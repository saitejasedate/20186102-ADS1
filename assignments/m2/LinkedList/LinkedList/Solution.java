/**
 * @author : saitejasedate.
 */
import java.util.Scanner;
/**
 * Solution class.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        /**
         * Empty constructor.
         */
    }
    /**
     * main function to take input and call the functions.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList l = new LinkedList();
        while (scan.hasNext()) {
            String[] line = scan.nextLine().split(" ");
            switch (line[0]) {
                case "size":
                System.out.println(l.size());
                break;
                case "pushLeft":
                l.pushLeft(Integer.parseInt(line[1]));
                System.out.println(l);
                break;
                case "pushRight":
                l.pushRight(Integer.parseInt(line[1]));
                System.out.println(l);
                break;
                case "removeLeft":
                l.removeLeft();
                System.out.println(l);
                break;
                case "remove":
                l.remove(Integer.parseInt(line[1]));
                System.out.println(l);
                break;
                case "removeRight":
                l.removeRight();
                System.out.println(l);
                break;
                case "popLeft":
                l.popLeft();
                System.out.println(l);
                break;
                default:
                break;
            }
        }
    }
}

