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
		for (int i = 0; i < numOftestcases; i++) {
			Steque steobj = new Steque();
			while (sc.hasNext()) {
				String line = sc.nextLine();
				if (line.length() == 0) {
					System.out.println();
					break;
				}
				String[] tokens = sc.nextLine().split(" ");
				switch (tokens[0]) {
					case "push":
					steobj.push(tokens[1]);
					System.out.println(steobj);
					break;
					case "enqueue":
					steobj.enqueue(tokens[1]);
					System.out.println(steobj);
					break;
					case "pop":
					steobj.pop();
					System.out.println(steobj);
					break;
					default:
					break;
				}
			}
		}
	}
}