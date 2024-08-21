package demointerface;

public interface Flyable {

//  public String name;

  //  public static final float PI = 3.14f;
  float PI = 3.14f; // interface ko chứa các thuộc tính thông thường, chỉ chứa các hằng số

  public static final String name = "ABC";

  //  public abstract void bay();
  void fly(); // abstract method (ảo) viết gọn, đặc tả khả năng bay tổng quát

//  void demo() { // ko được do cần là abstract class
//    System.out.println("t");
//  }

  // java 1.8 (java 8) có hỗ trợ normal method
  // default method (thêm "default")
  default void demo1() {
    System.out.println("t");
  }
}


// NOTE:
// interface đặc tả các khả năng tổng quát, cách đặt tên thường cố gắng set là "tính từ có đuôi able" chỉ tính năng tổng quát
// nếu không sử dụng tính từ thì thông thường cũng được đặt tên bằng danh từ với quy tắc viết hoa chữ cái đầu của mỗi từ,
// Tuy nhiên, có một số quy ước mà nhiều lập trình viên ưa chuộng, như thêm tiền tố "I" vào tên để dễ phân biệt với class (lớp) cụ thể, như IShape.