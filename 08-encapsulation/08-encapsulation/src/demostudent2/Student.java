package demostudent2;

import java.io.StringReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Student {

  private static int AUTO_ID = 100; // Yêu cầu đề bài id có 3 chữ số nên bắt đầu = 100

  private int id;
  private String name;
  private LocalDate dob;
  private String className;
  private float gpa;
  private Gender gender;
  private Specialist specialist;

  public Student() {
    this.id = AUTO_ID;
    AUTO_ID++;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public float getGpa() {
    return gpa;
  }

  public void setGpa(float gpa) {
    this.gpa = gpa;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public Specialist getSpecialist() {
    return specialist;
  }

  public void setSpecialist(Specialist specialist) {
    this.specialist = specialist;
  }

  public void inputStudent() {
    System.out.println("Nhập tên sinh viên: ");
    this.setName(new Scanner(System.in).nextLine());

    System.out.println("Nhập ngày tháng năm sinh (dd/MM/yyyy): ");
    String dobStr = new Scanner(System.in).nextLine();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    this.setDob(LocalDate.parse(dobStr, formatter));

    System.out.println("Nhập tên lớp cuả sinh viên: ");
    this.setClassName(new Scanner(System.in).nextLine());

    System.out.println("Nhập điểm trung binh cuả sinh viên: ");
    this.setGpa(new Scanner(System.in).nextFloat());

    System.out.println("Chọn chuyên ngành của sinh viên: ");
    System.out.println("1. CNTT");
    System.out.println("2. VT");
    System.out.println("3. DT");
    System.out.println("4. QTKD");

    int choice;
    while (true) {
      choice = new Scanner(System.in).nextInt();
      if (choice >= 1 && choice <= 4) {
        break;
      }
      System.out.println("Giá trị lựa chọn chỉ từ 1 đến 4, vui lòng chọn lại: ");
    }
    switch (choice) {
      case 1:
        this.setSpecialist(Specialist.CNTT);
        break;
      case 2:
        this.setSpecialist(Specialist.VT);
        break;
      case 3:
        this.setSpecialist(Specialist.DT);
        break;
      case 4:
        this.setSpecialist(Specialist.QTKD);
        break;

    }

    System.out.println("Chọn giới tính cho sinh viên: ");
    System.out.println("1. Nam");
    System.out.println("2. Nữ");

    int gender;
    while (true) {
      gender = new Scanner(System.in).nextInt();
      if (gender >= 1 && gender <= 2) {
        break;
      }
      System.out.println("Giá trị lựa chọn chỉ từ 1 đến 2, vui lòng chọn lại: ");
    }
    switch (gender) {
      case 1:
        this.setGender(Gender.MALE);
        break;
      case 2:
        this.setGender(Gender.FEMALE);
        break;
    }
  }

  @Override
  public String toString() {
    return "Student{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", dob=" + dob +
        ", className='" + className + '\'' +
        ", gpa=" + gpa +
        ", gender=" + gender +
        ", specialist=" + specialist.getValue() +
        '}';
  }
}
