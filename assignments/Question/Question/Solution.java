import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		while (sc.hasNext()) {
			sb.append(sc.nextLine()+"::");
		}
		StringBuffer sb1 = new StringBuffer();
		// System.out.println(sb);
		sb1.append(sb.toString().split("::"));
		System.out.println(sb1);
	}
}