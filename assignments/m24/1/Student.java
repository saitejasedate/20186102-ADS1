import java.util.Scanner;
class Student {
  private int rollnum;
  private String name;
  private double marks;
  Student(final int rollnum, final String studname, final double marks) {
    this.rollnum = rollnum;
    this.name = studname;
    this.marks = marks;
  }
  public String getName() {
    return this.name;
  }
  public double getMarks() {
    return this.marks;
  }
}
