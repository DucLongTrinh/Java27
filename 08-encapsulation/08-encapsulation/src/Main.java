import demostudent.Student;

public class Main {

  public static void main(String[] args) {

    System.out.println("Hello World");
    demo();

    Student student = new Student();


//    student.name = "Nguyen Van A";
//    student.gpa = -5;
    student.setName("Nguyen Van A");
    student.setGpa(5);

    System.out.println(student.getName());

//    student.diHoc();
//
//    student.id = "666";
//    student.name = "Nguyen Van A";
//    student.address = "HN";
//    student.gpa = 5;

}

public static void demo () {

  }
}