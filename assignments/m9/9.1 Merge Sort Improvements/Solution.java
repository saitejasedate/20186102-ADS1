/**
 * @author : saitejasedate.
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * main method.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        MergeSort st = new MergeSort();
        while (sc.hasNext()) {
            String[] tokens = sc.nextLine().split(",");
            st.sort(tokens);
            String str = "[";
            int i;
            for (i = 0; i < tokens.length - 1; i++) {
                str += tokens[i] + ", ";
            }
            str += tokens[i] + "]";
            System.out.println(str);
            System.out.println();
        }
    }
}
