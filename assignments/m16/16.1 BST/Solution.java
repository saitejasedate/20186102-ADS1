import java.util.Scanner;
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //function.
    }
    /**
     * main.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        BST binarysearchtree = new BST();
        while (sc.hasNextLine()) {
            String[] tokens = sc.nextLine().split(",");
            switch (tokens[0]) {
            case "put":
                Book book = new Book(tokens[1], tokens[2],
                 Double.parseDouble(tokens[2 + 1]));
                binarysearchtree.put(book, tokens[2+2]);
                break;
            case "get":
                book = new Book(tokens[1],
                 tokens[2], Double.parseDouble(tokens[2 + 1]));
                System.out.println(binarysearchtree.get(book));
                break;
            default:
                break;
            }
        }
    }
}