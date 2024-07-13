import java.util.Scanner;

public class DemoArrayOfObject {

  public static class Demo { // static class

  }

  static { // static code
    System.out.println("abc");
    int x = 5;
    Student student = new Student();

  }

  public static int sum() { // static ham
    return 0;
  }

  static int a =  5; // static bien




  public static void main(String[] args) {
    int[] arr = new int[10];

//    for (int i = 0; i < arr.length; i++) {
//      System.out.print("Nhap so: ");
//      arr[i] = new Scanner(System.in).nextInt();
//
//    }

    Student[] students = new Student[10];
    for (int i = 0; i < students.length; i++) {
      students[i] = new Student();
      System.out.println("Nhap ten sinh vien: ");
      students[i].name = new Scanner(System.in).nextLine();

      System.out.println("Nhap diem sinh vien: ");
      students[i].gpa = new Scanner(System.in).nextFloat();

    }

  }


}
