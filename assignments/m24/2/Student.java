class Student {
	int rollnum;
	String name;
	double marks;
	Student (int rollnum, String name, double marks) {
		this.rollnum = rollnum;
		this.name = name;
		this.marks = marks;
	}
	public int getrollnum(){
		return rollnum;
	}

	public void setrollnum(int rollnum){
		this.rollnum = rollnum;
	}

	public String getname(){
		return name;
	}

	public void setname(String name){
		this.name = name;
	}

	public double getmarks(){
		return marks;
	}

	public void setmarks(double marks){
		this.marks = marks;
	}

	public String toString(){
		return this.rollnum+", "+this.name+", "+this.marks;
	}
}