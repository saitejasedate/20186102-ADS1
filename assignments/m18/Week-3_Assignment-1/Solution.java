/**
 * @author : saitejasedate.
 */
/**
 * import Scanner package.
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

    }
    /**
     * main function to take the input and call the methods.
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SymbolTable<String, Integer> symboltable = new SymbolTable<String, Integer>(); 
        String[] keys = sc.nextLine().split(" ");
        for (int i = 0; i < keys.length; i++) {
            symboltable.put(keys[i], i);
        }
        MaxPQ<Float> maxpq = new MaxPQ<Float>(keys.length);
        MinPQ<Float> minpq = new MinPQ<Float>(keys.length);
        System.out.println(symboltable.max());
    }
}

            // switch (method[0]) {
            //     case "max":
            //     System.out.println(symboltable.max());
            //     break;
            //     case "floor":
            //     System.out.println(symboltable.floor(method[1]));
            //     break;
            //     case "rank":
            //     System.out.println(symboltable.rank(method[1]));
            //     break;
            //     case "deleteMin":
            //     symboltable.deleteMin();
            //     break;
            //     case "contains":
            //     System.out.println(symboltable.contains(method[1]));
            //     break;
            //     case "keys":
            //     symboltable.keys();
            //     break;
            //     case "get":
            //     System.out.println(symboltable.get(method[1]));
            //     break;
            //     default:
            //     break;