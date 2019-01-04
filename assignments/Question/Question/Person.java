class Person  {
	private int regnum;
	private int section;
	Person (int regnum, int section) {
		this.regnum = regnum;
		this.section = section;
	}
	public int getregnum(){
		return regnum;
	}

	public void setregnum(int regnum){
		this.regnum = regnum;
	}

	public int getsection(){
		return section;
	}

	public void setsection(int section){
		this.section = section;
	}

	// public int compareTo(Person that) {
	// 	Person a = this;
	// 	if (a.wins > that.wins) return 1;
	// 	if (a.wins < that.wins) return -1;
	// 	if (a.losses < that.losses) return 1;
	// 	if (a.losses > that.losses) return -1;
	// 	if (a.draws > that.draws) return 1;
	// 	if (a.draws < that.draws) return -1;
	// 	return 0;
	// }
}