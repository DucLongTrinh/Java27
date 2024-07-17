import java.time.LocalDate;
import java.util.Scanner;

public class Student extends Person {



  private String specialist;
  private float gpa;

  public String getSpecialist() {
    return specialist;
  }

  public void setSpecialist(String specialist) {
    this.specialist = specialist;
  }

  public float getGpa() {
    return gpa;
  }

  public void setGpa(float gpa) {
    this.gpa = gpa;
  }

  @Override // có cũng được
  public void demo() {
    System.out.println("Đang gọi hàm của student");
  }

  @Override
  public void nhapThongTin() {
    super.nhapThongTin();
    System.out.println("Nhập điểm: ");
    this.gpa = new Scanner(System.in).nextFloat();
  }


}
