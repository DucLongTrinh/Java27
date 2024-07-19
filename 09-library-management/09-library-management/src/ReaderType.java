public enum ReaderType {
  STUDENT("Sinh Viên"),
  POST_STUDENT("Học viên cao học"),
  TEACHER("Giảng viên");

  public String value;

  public String getValue() { // ở trường hợp này chỉ cần lấy giá trị với get
    return value;
  }

  ReaderType(String value) { // tạo hàm constructor
    this.value = value;
  }
}
