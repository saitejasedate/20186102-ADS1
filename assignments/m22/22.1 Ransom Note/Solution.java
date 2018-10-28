/**
 * @author : saiteja sedate.
 * import Scanner class.
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
		/**
		 * Empty constructor.
		 */
	}
	/**
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nummagwrds = sc.nextInt();
		int numranwrds = sc.nextInt();
		sc.nextLine();
		SeparateChainingHashST<String, Integer> sct = new SeparateChainingHashST<String, Integer>();
		sc.nextLine();
		String[]magwrds = sc.nextLine().split(" ");
		String[]ranwrds = sc.nextLine().split(" ");
		for(int i = 0; i < magwrds.length; i++) {
			if (sct.contains(magwrds[i])) {
				int count = sct.get(magwrds[i]);
				sct.put(magwrds[i], count+1);
			} else {
				sct.put(magwrds[i], 1);
			}
		}
		boolean flag = true;
		for (int i = 0; i < ranwrds.length; i++) {
			if (sct.contains(ranwrds[i])) {
				int count = sct.get(ranwrds[i]);
				if (count == 0) {
					flag = false;
					break;
				}
				sct.put(ranwrds[i], count-1);
			} else {
				flag = false;
				break;
			}
		}
		if (flag == false)
			System.out.println("No");
		else
			System.out.println("Yes");
	}		
}
