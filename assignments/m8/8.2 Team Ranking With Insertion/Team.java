/**
 * Class for team.
 */
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
	 * @param      country  The countryT
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
	/**
	 * Gets country.
	 *
	 * @return     country.
	 */
	public String getcountry() {
		return country;
	}
	/**
	 * Sets country.
	 *
	 * @param      country  The country.
	 */
	public void setcountry(String country) {
		this.country = country;
	}
	/**
	 * Get wins.
	 *
	 * @return     wins.
	 */
	public int getwins(){
		return wins;
	}
	/**
	 * Set wins.
	 *
	 * @param      wins  The wins.
	 */
	public void setwins(int wins){
	  	this.wins = wins;
	}
	/**
	 * Get loses.
	 *
	 * @return     loses.
	 */
	public int getloses() {
		return loses;
	}
	/**
	 * Set loses.
	 *
	 * @param      loses  The loses.
	 */
	public void setloses(int loses) {
		this.loses = loses;
	}
	/**
	 * Get draws.
	 *
	 * @return     draws.
	 */
	public int getdraws() {
		return draws;
	}
	/**
	 * Set draws.
	 *
	 * @param      draws  The draws.
	 */
	public void setdraws(int draws) {
		this.draws = draws;
	}
	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		return this.country;		
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
		if (a.loses > that.loses) return -1;
		if (a.loses < that.loses) return 1;
		if (a.draws > that.draws) return 1;
		if (a.draws < that.draws) return -1; 
		return 0;
	}
}
