import java.util.*;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		while (sc.hasNext()) {
			sb.append(sc.next() + "::");
		}
		String[] lines = sb.toString().split("::");
		int i = 0;
		Team[] teams = new Team[lines.length];
		System.out.println("h");
		for (String line : lines) {
			String[] tokens = line.split(",");
			Team team = new Team(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]),
				Integer.parseInt(tokens[3]));
			teams[i++] = team;
		}
		Insertion.sort(teams);
		String output = "";
		for (Team team : teams) {
			System.out.println(team);
		}
	}
}