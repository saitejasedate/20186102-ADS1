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
}