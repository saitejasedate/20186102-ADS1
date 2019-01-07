import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		LinearProbingHashST<Integer, Integer> lst = new LinearProbingHashST<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		while (sc.hasNext()) {
			sb.append(sc.nextLine()+"::");
		}
		String[] str = sb.toString().split("::");
		System.out.println(lst.size());
	}
}