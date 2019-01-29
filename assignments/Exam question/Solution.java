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
		int size = 9;
		Position[] positions = new Position[size];
		int count = 0;
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
				} else{
					count += i;
				}
			}
			if (arr.length() != 0) {
				String finalpos = "["+arr;
				temp = finalpos.substring(0, finalpos.length() - 2)+"]";
				Position pos = new Position(i, frequency, temp);
				lst1.put(i, pos);
			} else {
				temp.toString();
				Position pos = new Position(0, 0, "0");
				lst1.put(i, pos);
			}
			positions[i] = lst1.get(i);
		}
		Insertion.sort(positions);
		System.out.println(word+":"+totalfreq);
		if (totalfreq == 0) {
			System.out.println("word is not present in any file");
		} else {

			for (Position pos : positions) {
				if (pos.getindvfreq() != 0) {
					System.out.println(pos);
				}
			}
		}
	}
}
