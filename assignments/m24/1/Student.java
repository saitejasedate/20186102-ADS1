/**
 * Class for student.
 */
class Student {
  /**
   * rollnum.
   */
  private int rollnum;
  /**
   * studname.
   */
  private String name;
  /**
   * marks.
   */
  private double marks;
  /**
   * Constructs the object.
   *
   * @param      rollnum   The rollnum
   * @param      studname  The studname
   * @param      marks     The marks
   */
  Student(final int rollnum1, final String studname, final double marks1) {
    this.rollnum = rollnum1;
    this.name = studname;
    this.marks = marks1;
  }
  /**
   * Gets the name.
   *
   * @return     The name.
   */
  public String getName() {
    return this.name;
  }
  /**
   * Gets the marks.
   *
   * @return     The marks.
   */
  public double getMarks() {
    return this.marks;
  }
}
