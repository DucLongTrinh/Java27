package constant;

public enum ItemType {
  DT("Điện tử"),
  DL("Điện lạnh"),
  MT("Máy tính"),
  TBVP("Thiết bị văn phòng");

  public String value;

  public String getValue() {
    return value;
  }

  ItemType(String value) {
    this.value = value;
  }
}

