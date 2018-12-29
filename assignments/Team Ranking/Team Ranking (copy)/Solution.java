import java.util.*;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		while (sc.hasNext()) {
			sb.append(sc.nextLine() + "::");
		}
		String[] lines = sb.toString().split("::");
		int i = 0;
		Team[] teams = new Team[lines.length];
		for (String line : lines) {
			String[] tokens = line.split(" ");
			Team team = new Team(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]),
				Integer.parseInt(tokens[3]));
			teams[i++] = team;
		}
		Insertion.sort(teams);
		String output = "";
		for (Team team : teams) {
			output += team + ",";
		}
		System.out.print(output.substring(0, output.length() - 1));
	}
}