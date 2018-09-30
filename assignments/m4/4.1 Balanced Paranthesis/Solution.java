import java.util.Scanner;
/**.
 * List.
 */
class LinkedList {
    /**.
     * Node class.
     */

    private class Node {
        /**.
         * The node class which is used to perform the Linked list.
         */

        private char data;
        /**.
         * It is the data used in the operation of the charcter type.
         */

        private Node nextnode;
        /**.
        * It is the link address of the node data type.
        */
    }
/**
 private node head.
 */
    private Node head = null;
/**
 * @param item char.
 */
    public void push(final char item) {
        /**
         * It is the push method to insert the element into the Stack.
         */
        Node temp = new Node();
        temp.data = item;
        temp.nextnode = head;
        head = temp;
    }
/**
 * @return data.
 */
    public char pop() {
        /**
         * It is the pop method to remove the element into the Stack.
         */
        char data = head.data;
        head = head.nextnode;
        return  data;
    }

/**
 *class.
 *@return boolean.
 */
    public boolean isEmpty() {
        return  head == null;
    }
    /**.
     * 
     *
     * @return   description
     */

    public char top() {
        return head.data;
    }

}
/**
 Solution class.
 */
public final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {
    /**.
     * It is the constructor of the solution class.
     */
    }
    /**.
     * 
     *
     * @param args arguments
     */
    public static void main(final String[] args) {
        /**
         * It is the main method.
         */
        Scanner scan = new Scanner(System.in);
        int k = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < k; i++) {
            String s = scan.next();
            if (theparantheses(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    /**.
     * 
     *
     * @param  s  String of the input data.
     *
     * @return     It returns the boolean value whether the chr is present in data
     * or not.
     */
    public static boolean theparantheses(final String s) {
        /**
         * It is the function,which checks whether the char is present in the 
         * String or not.
         */
        LinkedList l = new LinkedList();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                l.push(ch);
            } else {
                if (l.isEmpty()) {
                    return false;
                }
                if (ch == '}' && l.top() == '{') {
                    l.pop();
                } else if (ch == ']' && l.top() == '[') {
                    l.pop();
                } else if (ch == ')' && l.top() == '(') {
                    l.pop();
                } else {
                    return false;
                }

            }
        }
        return l.isEmpty();
    }
}