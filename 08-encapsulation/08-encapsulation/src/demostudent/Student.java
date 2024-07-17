package demostudent;

import java.time.LocalDate;

// default is class Student
public class Student {

  // Thuộc tính (Property)
  private int id;
  private String name;
  private String address;
  private LocalDate dob;
  private float gpa;

  public Student() {

  }

  private void diHoc() {
    System.out.println("Sinh vien di hoc ...");
  }

  public void demo() {
    address = "eeeee";
    this.diHoc();
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public LocalDate getDob() {
    return dob;
  }


// Validation (validate)
  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public float getGpa() {
    return gpa;
  }

  public void setGpa(float gpa) {
    this.gpa = gpa;
  }
}