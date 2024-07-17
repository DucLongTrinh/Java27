import java.time.LocalDate;
import java.util.Scanner;

public class Person {

  protected String id;
  protected String name;    // Protected để class kế thừa gọi được
  protected String address;
  protected LocalDate dob;
  private String gender;    // Private chỉ trong class Person nhìn thấy thôi, bên ngoài cần gọi get, set


  protected String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void demo() {
    System.out.println("Đang gọi hàm của Person");
  }

  public void nhapThongTin() {
    System.out.println("Nhập tên: ");
    this.name = new Scanner(System.in).nextLine();
  }

}
