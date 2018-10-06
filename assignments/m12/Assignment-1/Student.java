/**
 * Class for Student.
 */
class Student implements Comparable<Student> {
	/**The Student class also implements the interface
	of the Comparable class.**/
	private String name;
	private String dateOfbirth; 
	private int subject1;
	private int subject2;
	private int subject3;
	private int totalmarks;
	private String reservation;

	Student (String name, String dateOfbirth, int subject1, int subject2, int subject3,
		int totalmarks, String reservation) {
		this.name = name;
		this.dateOfbirth = dateOfbirth;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.totalmarks = totalmarks;
		this.reservation = reservation;
	}
	/**
	 * Gets name.
	 *
	 * @return     name.
	 */
	public String getname() {
		return name;
	}
	/**
	 * Sets name.
	 *
	 * @param      name  The name.
	 */
	public void setname(String name) {
		this.name = name;
	}
	/**
	 * Get dateOfbirth.
	 *
	 * @return     dateOfbirth.
	 */
	public String getdateOfbirth(){
		return dateOfbirth;
	}
	/**
	 * Set dateOfbirth.
	 *
	 * @param      dateOfbirth  The dateOfbirth.
	 */
	public void setdateOfbirth(String dateOfbirth){
	  	this.dateOfbirth = dateOfbirth;
	}
	/**
	 * Get subject1.
	 *
	 * @return     subject1.
	 */
	public int getsubject1() {
		return subject1;
	}
	/**
	 * Set subject1.
	 *
	 * @param      subject1  The subject1.
	 */
	public void setsubject1(int subject1) {
		this.subject1 = subject1;
	}
	/**
	 * Get subject2.
	 *
	 * @return     subject2. 
	 */
	public int getsubject2() {
		return subject2;
	}
	/**
	 * Set subject2.
	 *
	 * @param      subject2  The subject2.
	 */
	public void setsubject2(int subject2) {
		this.subject2 = subject2;
	}
	/**
	 * Get subject3.
	 *
	 * @return     subject3.
	 */
	public int getsubject3() {
		return subject3;
	}
	/**
	 * Set subject3.
	 *
	 * @param      subject3  The subject2.
	 */
	public void setsubject3(int subject3) {
		this.subject3 = subject3;
	}
	/**
	 * Get totalmarks.
	 *
	 * @return     totalmarks.
	 */
	public int gettotalmarks() {
		return totalmarks;
	}
	/**
	 * Set totalmarks.
	 *
	 * @param      totalmarks  The totalmarks.
	 */
	public void settotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}
	/**
	 * Get resrvation
	 *
	 * @return reservation.
	 */
	public String getreservation() {
		return reservation;
	}
	/**
	 * Set reservation.
	 *
	 * @param      reservation The reservation.
	 */
	public void setreservation(String reservation) {
		this.reservation = reservation;
	}
	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		return this.name;		
	}

	/**
	 * comapares two objects in the given condition.
	 *
	 * @param      that  The that
	 *
	 * @return    
	 */
	public int compareTo(Student that) {
		Student a = this;
		if (a.totalmarks > that.totalmarks) return 1;
		if (a.totalmarks < that.totalmarks) return -1;
		if (a.subject3 > that.subject3) return 1;
		if (a.subject3 < that.subject3) return -1;
		if (a.subject2 > that.subject2) return 1;
		if (a.subject2 < that.subject2) return -1; 
		return 0;
	}
}
