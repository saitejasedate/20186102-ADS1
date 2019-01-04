// import java.util.Scanner;
// class Solution {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		SeparateChainingHashST<Integer, Integer> st = new SeparateChainingHashST<Integer, Integer>();
// 		// while (sc.hasNextLine()) {
// 			if (sc.nextLine() == "JC") {
// 				if (st.isEmpty()) {
// 					System.out.println("No registration");
// 				}
// 				else {
// 					st.keys();
// 				}
// 			}
// 			else {
// 				String[] str = sc.nextLine().split(",");
// 				st.put(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
// 				System.out.println(st.keys());
// 		}
// 	}
// }
// 
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Person> map = new HashMap<>();
		StringBuffer sb = new StringBuffer();
		while (sc.hasNext()) {
			sb.append(sc.nextLine() + "::");
		}
		String[] lines = sb.toString().split("::");
		System.out.println(lines[0]);
		Person[] persons = new Person[lines.length];
		for (String line : lines) {
			if (line.equals("JC")) {
				if (map.isEmpty()) {
					System.out.println("NO Registration");
				}
				else {
					System.out.println(map);
				}
			}
			else {
				String[] tokens = line.split(",");
				Person person = new Person(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
				map.put(Integer.parseInt(tokens[0]), person);
				System.out.println(map.toString());
			}
		}
	}
}