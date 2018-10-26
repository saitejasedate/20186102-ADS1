import java.util.Scanner;
class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {
		/**
		 * Empty constructor.
		 */
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOftestcases = sc.nextInt();
		sc.nextLine();
		Steque steque = new Steque();
		for (int i = 0; i < numOftestcases; i++) {
			while (sc.hasNext()) {
				String line = sc.nextLine();
				if (line.length() == 0) {
					break;
				}
				String[] tokens = sc.nextLine().split(" ");
				switch (tokens[0]) {
					case "push":
					steque.push(tokens[1]);
					System.out.println(steque);
					break;
					case "enqueue":
					steque.enqueue(tokens[1]);
					System.out.println(steque);
					break;
					case "pop":
					steque.pop();
					System.out.println(steque);
					break;
					default:
					break;
				}
			}
		}
	}
}