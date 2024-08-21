package entity;

// abstract class - lop truu tuong (ảo)
public abstract class Person { // thường đặt tên bằng danh từ và viết hoa chữ cái đầu của mỗi từ

  private String id;
  private String name;
  private String address;
  private String phone;
  private String gender;

  public Person() {
  }

  public Person(String id, String name, String address, String phone, String gender) {
    this.id = id;
    this.name = name;
    this.address = address;
    this.phone = phone;
    this.gender = gender;
  }

  public String getId() {
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

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public void lamViec() {
    System.out.println("...");
  }

  // Normal method
  public void choi() {
    System.out.println("...");
  }


  // abstract method - method truu tuong
  public abstract void nghiNgoi();

  public abstract void anUong();

}
