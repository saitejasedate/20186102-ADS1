class Student {
  int rollnum;
  String name;
  double marks;
  Student (int rollnum, String name, double marks){
    this.rollnum = rollnum;
    this.name = name;
    this.marks = marks;
  }
   public String getName(){
    return this.name;
   }
   public int getRoll() {
    return this.rollnum;
   }
   public double getMarks() {
    return this.marks;
   }
}