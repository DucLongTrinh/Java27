package demostudent2;

public enum Specialist {
  CNTT("Công nghệ thông tin"),
  VT("Viễn thông"),
  DT("Điện tử"),
  QTKD("Quản trị kinh doanh");

  public String value;

  public String getValue() {
    return value;
  }

  Specialist(String value) {
    this.value = value;
  }


}