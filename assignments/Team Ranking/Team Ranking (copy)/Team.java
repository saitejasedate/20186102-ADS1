/**
 * Class for Team.
 */
class Team implements Comparable<Team> {
	/**The Team class also implements the interface
	of the Comparable class.**/
	private String teamname;
	private int wins; 
	private int losses; 
	private int draws; 

	Team (String teamname, int wins, int losses, int draws) {
		this.teamname = teamname;
		this.wins = wins;
		this.losses = losses;
		this.draws = draws;
	}
	/**
	 * Gets name.
	 *
	 * @return     name.
	 */
	public String getteamname() {
		return teamname;
	}
	/**
	 * Sets teamname.
	 *
	 * @param      name  The teamname.
	 */
	public void setteamname(String name) {
		this.teamname = teamname;
	}
	
	public int getwins() {
		return wins; 
	}

	public int setwins(int wins) {
		return this.wins = wins;
	}

	public int getlosses() {
		return losses;
	}

	public int setlosses(int losses) {
		return this.losses = losses;
	}

	public int getdraws() {
		return draws;
	}

	public int setdraws(int draws) {
		return this.draws = draws;
	}
	public String toString() {
		return this.teamname;		
	}

	/**
	 * comapares two objects in the given condition.
	 *
	 * @param      that  The that
	 *
	 * @return    
	 */
	public int compareTo(Team that) {
		Team a = this;
		if (a.wins > that.wins) return 1;
		if (a.wins < that.wins) return -1;
		if (a.losses < that.losses) return 1;
		if (a.losses > that.losses) return -1;
		if (a.draws > that.draws) return 1;
		if (a.draws < that.draws) return -1;
		return 0;
	}
}
