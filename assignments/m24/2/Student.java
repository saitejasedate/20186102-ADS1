class Student {
	int rollnum;
	String name;
	double marks;
	Student(int rollnum, String name, double marks) {
			this.rollnum = rollnum;
			this.name = name;
			this.marks = marks;
	}
	public int getrollnum() {
		return this.rollnum;
	}

	public String getstudentname() {
		return this.name;
	}

	public double getmarks() {
		return this.marks;
	}
}