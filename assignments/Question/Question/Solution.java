import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		SeparateChainingHashST<Integer, Jury> lst = new SeparateChainingHashST<Integer, Jury>();
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		while (sc.hasNext()) {
			sb.append(sc.nextLine()+"::");
		}
		String[] str = sb.toString().split("::");
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("JC")) {
				// print();
				System.out.println("N");
			}
			else {
				String[] str1 = str[i].split(",");
				Jury jury = new Jury(Integer.parseInt(str1[0]), Integer.parseInt(str1[1]));
				// switch(str1[1]) {
				// 	case "1":
				// }
				lst.put(Integer.parseInt(str1[1]), jury);
				System.out.println(lst);
			}
		}
	}
	// public static lst print() {
	// 	SeparateChainingHashST<Integer, Jury> lst = new SeparateChainingHashST<Integer, Jury>();
	// 	return lst;
	// } 
}