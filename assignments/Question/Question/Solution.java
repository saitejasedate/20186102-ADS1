import java.util.Stack;
import java.util.Map;
import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s1 = new Stack<Integer>();
		StringBuffer sb = new StringBuffer();
		while (sc.hasNext()) {
			sb.append(sc.nextLine() + "::");
		}
		String[] lines = sb.toString().split("::");
		for (String line : lines) {
			if (line != "JC") {
				// String[] tokens = line.split(",");
				s1.push(Integer.parseInt(line));
				System.out.println(s1); 
			}
			else {
				String[] tokens = line.split(",");
			}
		}
	} 
}