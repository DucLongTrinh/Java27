public class DemoPointer {

  public static void main(String[] args) {
    int a = 5;
    System.out.println(a);
    tangGiaTri(a);
    System.out.println(a);

    Student student = new Student();   // Khởi tạo đối tượng, tạo ra ô nhớ ready lưu giá trị student (dòng này lưu trong bộ nhớ STACK)
    Student student1 = null;   // Null không tạo ra ô nhớ dành cho student1 (trên RAM), rỗng hay 0 vẫn có ô nhớ trên RAM với giá trị "rỗng" hay 0
    student.gpa = 5;            // gọi được do ô nhớ dành cho student đã được tạo ra (giá trị student và các giá trị của các thuộc tính của student như id, gpa, name ... lưu trong bộ nhớ HEAP)
    student1.gpa = 6;           // không gọi được do chưa có ô nhớ được tạo ra dành cho student1
    System.out.println(student);
    System.out.println(student1);
//    tangGiaTri(student);
//    System.out.println(student);

//    int b = a;
//    System.out.println(b);
//    b++;
//    System.out.println(b);
//    System.out.println(a);
//
//    Student sv1 = new Student();
//    sv1.gpa = 5;
//    Student sv2 = new Student();
//    sv2 = sv1; // Hành động để 2 object là một (thực tế hiếm khi dùng)
//    System.out.println(sv1);
//    System.out.println(sv2);
//    sv2.gpa = 100;
//    System.out.println(sv1);
//    System.out.println(sv2);
  }

  // Pass by value
  public static void tangGiaTri(int x) {
    x++;
  }

  // Pass by reference
  public static void tangGiaTri(Student sv) {
    sv.gpa++;
  }
}


