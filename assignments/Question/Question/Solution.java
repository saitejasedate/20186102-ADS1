import java.util.Scanner;
class Solution {
	public static int c;
	public static String[] str1;
	public static void main(String[] args) {
		int c = 0;
		SeparateChainingHashST<Integer, Jury> lst = new SeparateChainingHashST<Integer, Jury>();
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		while (sc.hasNext()) {
			sb.append(sc.nextLine()+"::");
		}
		String[] str = sb.toString().split("::");
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("JC")) {
				print();
				// System.out.println("N");
			}
			else {
				String[] str1 = str[i].split(",");
				Jury jury = new Jury(Integer.parseInt(str1[0]), Integer.parseInt(str1[1]));
				lst.put(Integer.parseInt(str1[1]), jury);
				c++;
			}
		}
	}
	public static Jury print() {
		SeparateChainingHashST<Integer, Jury> lst = new SeparateChainingHashST<Integer, Jury>();
		if (c == 1) {
			return lst.get(Integer.parseInt(str1[1]));
		}
		return null;
	} 
}