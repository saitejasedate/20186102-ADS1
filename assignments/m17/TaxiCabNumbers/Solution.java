/**
 * @author : saitejasedate.
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
class Solution {
	/**
	 * Constructs the object.
	 */
	Solution () {
		/**
		 * Empty constructor.
		 */
	}
	/**
	 * main function to find the taxi cab number.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		System.out.println(Taxicab.findTaxicab(N,M));
	}	
}	