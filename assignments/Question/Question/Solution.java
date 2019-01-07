import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		while (sc.hasNext()) {
			sb.append(sc.nextLine()+"::");
		}
		String[] str = sb.toString().split("::");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}