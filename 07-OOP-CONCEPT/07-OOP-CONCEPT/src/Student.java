import java.time.LocalDate;

public class Student {


    // Thuoc tinh
    String id;
    String name;
    LocalDate dateOfBirth;
    String gender;
    float gpa;

    // Ham khoi tao (constructor) cần giống tên class

    public Student() {
//      System.out.println("Dang khoi tao doi tuong sinh vien");
    }

    // Hàm khởi tạo có tham số truyền vào

    public Student (String name, int abc) {

    }

    // Kha nang

    public void hocBai () {

    }

    public void thiCu () {

    }

    public void choiGame () {

    }

    public void yeu () {

    }

    @Override
    public String toString() {
        return "Student{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", dateOfBirth=" + dateOfBirth +
            ", gender='" + gender + '\'' +
            ", gpa=" + gpa +
            '}';
    }
}

