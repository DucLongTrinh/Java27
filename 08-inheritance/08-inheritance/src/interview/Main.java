package interview;

public class Main {

  public static void main(String[] args) {

    Dog dog = new Dog();
  }

}

// run in ra 2 dòng vì muốn tạo oject của class con thì default sẽ chạy constructor của class cha trước
// rồi mới chạy đến constructor của class con ko cần gọi supper(); (cấp phát bộ nhớ class cha trước)
