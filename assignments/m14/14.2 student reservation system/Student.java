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
     * String date.
     */
    private String date;
    /**
     * String month.
     */
    private String month;
    /**
     * String year.
     */
    private String year;
    /**
     * String subject1.
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
     * @param      name         The name
     * @param      date         The date
     * @param      month        The month
     * @param      year         The year
     * @param      subject1     The subject 1
     * @param      subject2     The subject 2
     * @param      subject3     The subject 3
     * @param      totalmarks   The totalmarks
     * @param      reservation  The reservation
     */
    Student (String name1, String date1, String month1, String year1, 
        int subject1, int subject2, int subject3,
        int totalmarks1, String reservation1) {
        this.name = name1;
        this.date = date1;
        this.month = month1;
        this.year = year1;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.totalmarks = totalmarks1;
        this.reservation = reservation1;
    }
    public boolean getAlloted() {
        return alloted;
    }
    public void setAlloted(final boolean alloted) {
        this.alloted = alloted;
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
    public void setname(String name1) {
        this.name = name1;
    }
    /**
     * Get dateOfbirth.
     *
     * @return     dateOfbirth.
     */
    public String getdate() {
        return date;
    }
    /**
     * Set dateOfbirth1.
     *
     * @param      dateOfbirth1  The dateOfbirth.
     */
    public void setdate(String date1) {
        this.date = date1;
    }
    /**
     * Get month.
     *
     * @return     { description_of_the_return_value }
     */
     public String getmonth() {
      return month;
     }
     /**
      * set month.
      *
      * @param      month1  The month 1
      */
     public void setmonth(String month1) {
      this.month = month1;
     }
     /**
      * Get year.
      *
      * @return     { description_of_the_return_value }
      */
      public String getyear(){
       return year;
      }
      /**
       * Sets year1.
       *
       * @param      year1  The year 1
       */
      public void setyear(String year1){
       this.year = year1;
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
     * Set totalmarks1.
     *
     * @param      totalmarks1  The totalmarks.
     */
    public void settotalmarks(int totalmarks1) {
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
    public void setreservation(String reservation1) {
        this.reservation = reservation1;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return this.name + "," + this.totalmarks + "," + this.reservation;
    }
    /**
     * compareTo function compares the inputs a and b.
     *
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
        if (Integer.parseInt(a.year) < Integer.parseInt(that.year)) {
            return -1;
        }
        if (Integer.parseInt(a.year) > Integer.parseInt(that.year)) {
            return 1;
        }
        if (Integer.parseInt(a.month) < Integer.parseInt(that.month)) {
            return -1;
        }
        if (Integer.parseInt(a.month) > Integer.parseInt(that.month)) {
            return 1;
        }
        if (Integer.parseInt(a.date) < Integer.parseInt(that.date)) {
            return -1;
        }
        if (Integer.parseInt(a.date) > Integer.parseInt(that.date)) {
            return 1;
        }
        return 0;
    }
}
