class Team implements Comparable<Team> {
	/**The Team class also implements the interface
	of the Comparable class.**/
	private String country;
	private int wins;
	private int loses;
	private int draws;
	/**
	 * Constructs the object.
	 *
	 * @param      country  The country
	 * @param      wins     The wins
	 * @param      loses    The loses
	 * @param      draws    The draws
	 */
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
		if (a.wins > that.wins) return 1;
		if (a.wins < that.wins) return -1;
		if (a.loses > that.loses) return -1;
		if (a.loses < that.loses) return 1;
		if (a.draws > that.draws) return 1;
		if (a.draws < that.draws) return -1; 
		return 0;
	}
}
