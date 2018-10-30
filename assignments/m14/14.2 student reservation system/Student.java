/**
 * Class for Student.
 */
class Student implements Comparable<Student> {
    /**The Student class also implements the interface
    of the Comparable class.**/
    /**
     * String name.
     */
    private String name;
    /**
     * String dob.
     */
    private String dob;
    /**
     * int subject1.
     */
    private int subject1;
    /**
     * String subject2.
     */
    private int subject2;
    /**
     * String subject3.
     */
    private int subject3;
    /**
     * String totalmarks.
     */
    private int totalmarks;
    /**
     * String reservation.
     */
    private String reservation;
    /**
     * boolean alloted.
     */
    private boolean alloted;
    /**
     * Constructs the object.
     *
     * @param      name1         The name 1
     * @param      dob1          The dob 1
     * @param      sub1          The sub 1
     * @param      sub2          The sub 2
     * @param      sub3          The sub 3
     * @param      totalmarks1   The totalmarks 1
     * @param      reservation1  The reservation 1
     */
    Student(final String name1, final String dob1,
        final int sub1, final int sub2, final int sub3,
        final int totalmarks1, final String reservation1) {
        this.name = name1;
        this.dob = dob1;
        this.subject1 = sub1;
        this.subject2 = sub2;
        this.subject3 = sub3;
        this.totalmarks = totalmarks1;
        this.reservation = reservation1;
    }
    /**
     * Gets the alloted.
     *
     * @return     The alloted.
     */
    public boolean getAlloted() {
        return alloted;
    }
    /**
     * Sets the alloted.
     *
     * @param      alloted1  The alloted 1
     */
    public void setAlloted(final boolean alloted1) {
        this.alloted = alloted1;
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
     * Sets name1.
     *
     * @param      name1  The name.
     */
    public void setname(final String name1) {
        this.name = name1;
    }
    // /**
    //  * Get date.
    //  *
    //  * @return     date.
    //  */
    // public int getdob() {
    //     return Integer.parseInt(dob);
    // }
    // /**
    //  * Set date1.
    //  *
    //  * @param      date1  The date.
    //  */
    // public void setdob(final String dob1) {
    //     this.dob = dob1;
    // }
    /**
     * { split the date of birth(dob) separated by "-" }.
     *
     * @return     { date }
     */
    int getdate() {
        String[] elements = this.dob.split("-");
        int date = Integer.parseInt(elements[0]);
        return date;
    }
    /**
     * { split the date of birth(dob) separated by "-" }.
     *
     * @return     { month }
     */
    int getmonth() {
        String[] elements = this.dob.split("-");
        int month = Integer.parseInt(elements[1]);
        return month;
    }
    /**
     * { split the date of birth(dob) separated by "-" }.
     *
     * @return     { year }
     */
    long getyear() {
        String[] elements = this.dob.split("-");
        long year = Integer.parseInt(elements[2]);
        return year;
    }

    /**
     * Get sub1.
     *
     * @return     { subject1 }
     */
    public int getsubject1() {
        return subject1;
    }
    /**
     * Set sub1.
     *
     * @param      sub1  The subject1.
     */
    public void setsubject1(final int sub1) {
        this.subject1 = sub1;
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
     * Set sub2.
     *
     * @param      sub2  The subject2.
     */
    public void setsubject2(final int sub2) {
        this.subject2 = sub2;
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
     * Set sub3.
     *
     * @param      sub3  The subject2.
     */
    public void setsubject3(final int sub3) {
        this.subject3 = sub3;
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
     * Set totalmarks1.
     *
     * @param      totalmarks1  The totalmarks.
     */
    public void settotalmarks(final int totalmarks1) {
        this.totalmarks = totalmarks1;
    }
    /**
     * Get resrvation.
     *
     * @return reservation.
     */
    public String getreservation() {
        return reservation;
    }
    /**
     * Set reservation1.
     * 
     * @param      reservation1 The reservation.
     */
    public void setreservation(final String reservation1) {
        this.reservation = reservation1;
    }
    /**
     * Returns a string representation of the object.
     * Time complexity is constant.
     * @return     String representation of the object.
     */
    public String toString() {
        return this.name + "," + this.totalmarks + "," + this.reservation;
    }
    /**
     * compareTo function compares the inputs a and b.
     * Time complexity is constant.
     * @param      that  The that
     *
     * @return     integer.
     */
    public int compareTo(final Student that) {
        Student a = this;
        if (a.totalmarks > that.totalmarks) {
            return 1;
        }
        if (a.totalmarks < that.totalmarks) {
            return -1;
        }
        if (a.subject3 > that.subject3) {
            return 1;
        }
        if (a.subject3 < that.subject3) {
            return -1;
        }
        if (a.subject2 > that.subject2) {
            return 1;
        }
        if (a.subject2 < that.subject2) {
            return -1;
        }
        if (a.getyear() < that.getyear()) {
            return -1;
        }
        if (a.getyear() > that.getyear()) {
            return 1;
        }
        if (a.getmonth() < that.getmonth()) {
            return -1;
        }
        if (a.getmonth() > that.getmonth()) {
            return 1;
        }
        if (a.getdate() < that.getdate()) {
            return -1;
        }
        if (a.getdate() > that.getdate()) {
            return 1;
        }
        return 0;
    }
}
