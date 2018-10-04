import java.util.Scanner;
/**
 * @author : saitejasedate.
 */
import java.util.Arrays;
/**.
 * Class for solution.
 */
public final class Solution {
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    /**
         * Constructs the object.
         */
        private Solution() {

        }
        /**.
         * main function to take num of inputs and store them in an array.
         *
         * @param      args  The arguments
         */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, count = 0;
        n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        /**
         * sort the elements of the array.
         */
        Arrays.sort(arr);
        /**
         * assign first element, second element, third element to find three sum.
         * i for the first element, j for the second element, x for the third element.
         * 
         * Time complexity for the program is O(N^2).
         */
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int x = n - 1;
            /**
             * check if the sum of any three elements is zero.
             * 
             */
            while (j < x) {
                /**
                 * if the sum equals zero, increment count, j by 1 and decrement x by 1.
                 */
                if (arr[i] + arr[j] + arr[x] == 0) {
                    count++;
                    j++;
                    x--;

                /**
                 * if the sum is less than zero, increment j by 1. 
                 */
                } else if (arr[i] + arr[j] + arr[x] < 0) {
                    j++;
                    
                /**
                 * if the sum is greater than zero, decrement k by 1.
                 */
                } else {
                    x--;
                }
            }
        }
        /**
         * when the execution exits from the loop, print the count of elements whose three sum is zero.
         * if count is greater than zero, print count.
         * else print "Three sum equals to zero is not possible".
         */
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("Three sum equals to zero is not possible");
        }
    }
}
