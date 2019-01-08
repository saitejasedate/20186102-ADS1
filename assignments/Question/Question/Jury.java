class Jury {
	private int regst;
	private int sectn;
	Jury (int regst, int sectn) {
		this.regst = regst;
		this.sectn = sectn;
	}
	public int getregst(){
		return regst;
	}

	public void setregst(int regst){
		this.regst = regst;
	}

	public int getsectn(){
		return sectn;
	}

	public void setsectn(int sectn){
		this.sectn = sectn;
	}

	public String toString(){
		return this.regst+","+this.sectn;
	}
}