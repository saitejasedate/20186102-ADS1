/**
 * @author : saitejasedate.
 */
/**
 * import java Scanner class.
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
     * main function to take input and calculate the median.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfvalues = sc.nextInt();
        SymbolTable<String, Integer> symboltable = new SymbolTable<String, Integer>();
        MinPQ<Float> minpq = new MinPQ<Float>(numOfvalues);
        MaxPQ<Float> maxpq = new MaxPQ<Float>(numOfvalues);
        while (sc.hasNext()) {
            String[] keys = sc.nextLine().split(" ");
            for (int i = 0; i < numOfvalues; i++) {
                symboltable.put(keys[i], i);
                System.out.println(symboltable.max());
            }
        }
    }
}