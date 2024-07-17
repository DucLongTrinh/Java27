package demostudent2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainStudent {

  public static void main(String[] args) {
    Student student = new Student();
    student.inputStudent();

    Student student2 = new Student();
    student2.inputStudent();
    System.out.println(student);
    System.out.println(student2);
  }

}
