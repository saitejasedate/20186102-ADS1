import java.util.Scanner;
/**
 * Class for solution.
 */
public final  class Solution {
    /**.
    * Constructs the object.
    */
    private Solution() {
        /**.
         * It is a constructor.
         */
    }
    /**.
     * It is the main method in this method,in this we can
     * take the input from the user and convert in to the array of
     * the elements depends upon the various data types.
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int numOfinputs = Integer.parseInt(sc.nextLine());
        switch (str) {
            /**
             * When the str value is String this case will
             * executes.
             */
            case "String":
            while (numOfinputs > 0) {
                String[] tokens = sc.nextLine().split(",");
                MinHeap min = new MinHeap(tokens);
                System.out.println(min.IsMinHeap());
                numOfinputs--;
            }
            break;
            /**
             * When the str value is Integer this case will
             * executes.
             */
            case "Integer":
            while (numOfinputs > 0) {
            String[] tokens = sc.nextLine().split(",");
            Integer[] inttokens = new Integer[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                inttokens[i] = Integer.parseInt(tokens[i]);
            }
            MinHeap min = new MinHeap(inttokens);
            System.out.println(min.IsMinHeap());
            numOfinputs--;
            }
            break;
            /**
             * When the str value is Float this case will
             * executes.
             */
            case "Float":
            while (numOfinputs > 0) {
                String input = sc.nextLine();
                if (input.equals("")) {
                    System.out.println(false);
                    break;
                } else {
                    String[] tokens = input.split(",");
                    Float[] floattokens = new Float[tokens.length];
                    for (int i = 0; i < tokens.length; i++) {
                        floattokens[i] = Float.parseFloat(tokens[i]);
                    }
                    MinHeap min = new MinHeap(floattokens);
                    System.out.println(min.IsMinHeap());
                    numOfinputs--;
                }
            }
            break;
            /**
            *
            *When the str value is Double this case will
            * executes.
            */
            case "Double":
            while (numOfinputs > 0) {
                String[] tokens = sc.nextLine().split(",");
                Double[] doubletokens = new Double[tokens.length];
                for (int i = 0; i < tokens.length; i++) {
                    doubletokens[i] = Double.parseDouble(tokens[i]);
                }
                MinHeap min = new MinHeap(doubletokens);
                System.out.println(min.IsMinHeap());
                numOfinputs--;
            }
            break;
            default:
            break;
        }
    }
}
