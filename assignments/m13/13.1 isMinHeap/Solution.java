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
         * It is a counstructor.
         */
    }
    /**.
     * It is the main method in this method,in this we can
     * take the input from the user and convert in to the array of
     * the eelements depends upon the various data types.
     * By the analysis the complexity of the method is O(N^2).
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        int numOfinputs = Integer.parseInt(sc.nextLine());
        switch (key) {
            /**
             * When the key value is String this case will
             * executes.
             */
            case "String":
            while (numOfinputs > 0) {
                String[] tokens = key.split(",");
                MinHeap min = new MinHeap(tokens);
                System.out.println(min.IsMinHeap());
                numOfinputs--;
            }
            break;
            /**
             * When the key value is Integer this case will
             * executes.
             */
            case "Integer":
            while (numOfinputs > 0) {
            String[] tokens = key.split(",");
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
             * When the key value is Float this case will
             * executes.
             */
            case "Float":
            while (numOfinputs > 0) {
                String input = key;
                if (input.equals("")) {
                    System.out.println(false);
                    break;
                } else {

            String[] tokens = input.split(",");
            Float[] floattokens = new Float[tokens.length];
            // if (numOfinputs !=tokens.length) {
            //     System.out.println(false);
            // }
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
         *When the key value is Double this case will
         * executes.
         */

        case "Double":
            while (numOfinputs > 0) {
            String[] tokens = key.split(",");
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
