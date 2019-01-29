import java.util.*;
import java.io.File;
class Solution {
	public static void main(String[] args)throws Exception {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		int totalfreq = 0;
		for (int i = 0; i <= 8; i++) {
			String position = "";
			int frequency = 0;
			Scanner sc = new Scanner (new File("Files/"+i+".txt"));
			String[] str = sc.nextLine().split(" ");
			Position[] positions = new Position[i+1];
			for (int j = 0; j < str.length; j++) {
				String key = str[j];
				if (key.equals(word)) {
					frequency++;
					totalfreq++;
					position += j+","; 
				}
			}
			String finalposition = ""; 
			finalposition+="["+position+"]";
			String var = finalposition.substring(0, finalposition.length() - 2)+"]";
			System.out.println(word);
			System.out.println(frequency);
			System.out.println(i);
			System.out.println(var);
			if (word != null && var != null) {
				Position pos = new Position(word, frequency, i, var);
				positions[i++] = pos;
			}
		for (Position arr : positions) {
			if (arr!=null) {
				System.out.println(arr);
			}
		}
		Insertion.sort(positions);
		}
	}	
}