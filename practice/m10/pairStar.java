import java.util.Scanner;
public class pairStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(pairstar(str));
	}
	static String pairstar(String str) {
		int len = str.length();
		int i = 0;
		String temp = "";
		if (i < len - 1) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				return temp += str.charAt(i) + "*" + pairstar(str.substring(1));
			} else {
				return temp += str.charAt(i) + pairstar(str.substring(1));
			}
		}
		return temp + str.charAt(i);
	}
}