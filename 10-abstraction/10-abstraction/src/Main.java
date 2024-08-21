import demointerface.Dragon;
import entity.Nguoi;
import entity.Person;
import entity.Student;

public class Main {

  public static void main(String[] args) {
    Nguoi conNguoi = new Nguoi();

    Student sv = new Student();
    sv.nghiNgoi();

    Student sv1 = new Student();
    sv1.nghiNgoi();


//    entity.Person person = new entity.Person(); // không tạo được trực tiếp vì entity.Person là astract class, cần thông qua entity.Student (ngoại trừ sử dụng Anonymous Class ở bài sau)
//    person.nghiNgoi();

//    Flyable fly = new Flyable(); // không tạo được trực tiếp từ interface Flyable có fly() là abstract method (ngoại trừ sử dụng Anonymous Class ở bài sau)
//    fly.fly();

    Dragon dragon = new Dragon();

    dragon.move(); // Method thường đặt tên là động từ hoặc cụm động từ với chữ cái đầu tiên viết thường và viết hoa chữ cái đầu tiên đối với các từ tiếp theo
    dragon.fly();

    // Tạo ra anonymous class (lớp vô danh) mở rộng (extends - kế thừa) từ class Person (Java tự động tạo ra: compile in Java). Do not reuse: ko mang tính tái sử dụng nên ko tạo ra một detail class như "Student"
    // Ở đây ko tạo ra một lớp cụ thể như "Bảo Vệ" mà chỉ tạo ra 1 object của class Person với các method được Override
    Person baoVe = new Person() {
      @Override
      public void nghiNgoi() {
        // code nghỉ ngơi như thế nào
      }

      @Override
      public void anUong() {
        // code
      }
    };

    Person xYZ = new Person() {
      @Override
      public void nghiNgoi() {
        // code nghỉ ngơi như thế nào
      }

      @Override
      public void anUong() {
        // code
      }
    };

  }

  public void hamNaoVay() {
    Person bamThangMay = new Person() {
      @Override
      public void nghiNgoi() {
        // code
      }

      @Override
      public void anUong() {
        // code
      }
    };
  }
}


// Note:
// Trong Java, quy tắc đặt tên biến (variable naming convention) và phương thức (method naming convention) đều có sự tương đồng và thường được định nghĩa như sau:

// + Tên bắt đầu bằng chữ thường: Tên biến và tên method đều bắt đầu bằng chữ cái thường (lowercase).

// + CamelCase cho các từ tiếp theo: Nếu tên bao gồm nhiều từ, thì mỗi từ sau từ đầu tiên sẽ bắt đầu bằng chữ in hoa (uppercase), đây được gọi là quy tắc CamelCase.
//   Tên biến thường ngắn gọn hơn tên method nhưng vẫn phải thể hiện được rõ ràng mục đích sử dụng.


// Video 1:26 / 2:26