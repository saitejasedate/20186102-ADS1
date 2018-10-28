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
class Solution {
    private Solution() {
        /**
         * Empty constructor.
         */
    }
    /**
     * main function to take inputs and and call the functions.
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinearProbingHashST<String, Integer> lpst = new LinearProbingHashST<String, Integer>();
        int nopes = sc.nextInt();
        for (int i = 0; i < nopes; i++) {
            String line = sc.nextLine();
            String[]tokens = line.split(" ");
            switch (tokens[0]) {
                case "put":
                    lpst.put(tokens[1],Integer.parseInt(tokens[2]));
                    break;
                case "delete":
                    lpst.delete(tokens[1]);
                    break;
                case "get":
                    lpst.get(tokens[1]);
                    System.out.println(lpst.get(tokens[1]));
                break;
                case "display":
                break;
                default:
                break;
            }
        }
    }
}
