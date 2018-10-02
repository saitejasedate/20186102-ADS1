import java.util.*;
	class Team implements Comparable<Team> {
	private String country;
	private int wins;
	private int loses;
	private int draws;
	Team (String country, int wins, int loses, int draws) {
		this.country = country;
		this.wins = wins;
		this.loses = loses;
		this.draws = draws;
	}
	public String getcountry() {
	return country;
	}

	public void setcountry(String country) {
	this.country = country;
	}

	public int getloses() {
	return loses;
	}

	public void setloses(int loses) {
	this.loses = loses;
	}

	public int getdraws() {
	return draws;
	}

	public void setdraws(int draws) {
	this.draws = draws;
	}

	public String toString() {
		return this.country;		
	}

	public int compareTo(Team that) {
		Team a = this;
		if (a.wins > that.wins) return -1;
		if (a.wins < that.wins) return 1;
		if (a.loses > that.loses) return 1;
		if (a.loses < that.loses) return -1;
		if (a.draws > that.draws) return -1;
		if (a.draws < that.draws) return 1; 
		return 0;
	}
}

class Selection_sort {
	public static void sort(Comparable[] arr) {
		int arr_length = arr.length;
		for (int i = 0; i < arr_length; i++) {
			int min = i;
			for (int j = i + 1; j < arr_length; j++) {
				if (less(arr[j], arr[min])) {
					min = j;
				}
			}
			exch (arr, i, min);
		}
	}
	private static boolean less(Comparable v, Comparable w) {
		return (v.compareTo(w) < 0);
	}
	private static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}

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
			String[] tokens = line.split(",");
			Team team = new Team(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), 
			Integer.parseInt(tokens[3]));
			teams[i++] = team;
		} 
		Selection_sort.sort(teams);
		for (Team team : teams) {
			String output = team + ","; 
			// System.out.print(output);
			if (output.endsWith(",")) {
			String output1 = output.substring(0, output.length() - 1);
			System.out.println(output1);
		}
		}
		
	}	
}
