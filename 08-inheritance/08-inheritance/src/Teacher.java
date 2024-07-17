import java.time.LocalDate;
import java.util.Scanner;

public class Teacher extends Person{


  private String level;
  private String specialist;

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public String getSpecialist() {
    return specialist;
  }

  public void setSpecialist(String specialist) {
    this.specialist = specialist;
  }

  @Override
  public void nhapThongTin() {
    super.nhapThongTin();
    System.out.println("Nhập chuyên ngành: ");
    this.specialist = new Scanner(System.in).nextLine();
  }
}
