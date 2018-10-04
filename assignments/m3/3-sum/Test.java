/**
 * @author : saitejasedate.
 */
import java.util.*;
/**
 * Class for test.
 */
public final class Test {
	/**
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	/**
	 * Constructs the object.
	 */
	private Test() {

	}
	/**
	 * main function to take num of inputs and store them in an array.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfinputs, count = 0;
		numOfinputs = sc.nextInt();
		int arr[] = new int[numOfinputs];
		for (int indexOfinput = 0; indexOfinput < numOfinputs; indexOfinput++) {
			arr[indexOfinput] = sc.nextInt();
		}
		/**
         * sort the elements of the array.
         */
		Arrays.sort(arr);
		/**
         * assign first element, second element, third element to find three sum.
         * first_element for the first element, 
		  * second_element for the second element, 
		  * third_element for the third element.
         * 
         * Time complexity is O(N^2).
         */
		for (int first_element = 0; first_element < numOfinputs - 2; first_element++) {
			int second_element = first_element + 1;
			int third_element = numOfinputs - 1;
			/**
             * check if the sum of any three elements is zero.
             * 
             */
			while (second_element < third_element) {
				/**
                 * if the sum equals zero, increment count, 
				 * second_element by 1 and decrement third_element by 1.
                 */
				if (arr[first_element] + arr[second_element] + arr[third_element] == 0) {
					count++;
					second_element++;
					third_element--;

				/**
                 * if the sum is less than zero, 
				 * increment second_element by 1. 
                 */
				} else if (arr[first_element] + arr[second_element] + arr[third_element] < 0) {
					second_element++;

				/**
                 * if the sum is greater than zero, 
				 * decrement third_element by 1.
                 */
				} else {
					third_element--;
				}
			}
		}
		/**
         * when the execution exits from the loop, print the count 
		  * of elements whose three sum is zero.
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

