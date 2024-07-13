package demostudent;

public class Student {

  public String id;
  protected String name;
  String address;
  String dob;
  float gpa;

  public Student () {

  }

  public void diHoc() {
    System.out.println("Sinh vien di hoc ...");
  }

  public void demo() {
    address = "eeeee";
    this.diHoc();
  }

}