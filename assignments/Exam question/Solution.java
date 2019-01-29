import java.util.*;
import java.io.File;
class Solution {
	public static void main(String[] args)throws Exception {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		LinearProbingHashST<Integer, Position> lst1 = new LinearProbingHashST<Integer, Position>();
		int totalfreq = 0;
		int frequency = 0;
		String arr = "";
		String temp = "";
		for (int i = 0; i <= 8; i++) {
			Scanner sc = new Scanner (new File("Files/"+i+".txt"));
			String[] str = sc.nextLine().split(" ");
			frequency = 0;
			arr = "";
			for (int j = 0; j < str.length; j++) {
				String key = str[j];
				if (key.equals(word)) {
					frequency++;
					totalfreq++;
					arr+=j+", ";
				}
			}
			if (arr.length() == 0) {
				temp = "0";
			} else {
				String finalpos = "["+arr;
				temp = finalpos.substring(0, finalpos.length() - 2)+"]";
				Position pos = new Position(i, frequency, temp);
				lst1.put(i, pos);
			}
			System.out.println(word+":"+totalfreq);
			if (lst1.get(i) == null) {
				System.out.println();
			} else {
				System.out.println(lst1.get(i));
			}
		}
	}	
}
