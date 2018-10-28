import java.util.Scanner;
/**
 * @author : saitejasedate.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //unused constructor.
    }
    /**
     * main method.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        BST bst = new BST();
        while (scan.hasNext()) {
            String[] tokens = scan.nextLine().split(",");
            final int three = 3;
            final int four = 4;
            switch (tokens[0]) {
            case "put":
                Book books = new Book(tokens[1],
                                      tokens[2],
                                      Float.parseFloat(tokens[three]));
                bst.put(books, Integer.parseInt(tokens[four]));
                break;
            case "get":
                books = new Book(tokens[1], tokens[2],
                                 Float.parseFloat(tokens[three]));
                if (bst.get(books) == null) {
                    System.out.println("null");
                } else {
                    System.out.println(bst.get(books));
                }
                break;
            case "max":
                System.out.println(bst.max());
                break;
            case "min":
                System.out.println(bst.min());
                break;
            case "select":
                System.out.println(bst.select(Integer.parseInt(tokens[1])));
                break;
            case "floor":
                books = new Book(tokens[1],
                                 tokens[2], Float.parseFloat(tokens[three]));
                System.out.println(bst.floor(books));
                break;
            case "ceiling":
                books = new Book(tokens[1],
                                 tokens[2], Float.parseFloat(tokens[three]));
                System.out.println(bst.ceiling(books));
                break;
            default:
            break;
            }
        }
    }
}
