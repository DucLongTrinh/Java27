package democircle;

import java.util.Scanner;

public class MainCircle {

  public static void main(String[] args) {

// Cach 1
//    Circle circle = new Circle();
//    System.out.println("Nhap ban kinh hinh tron: ");
//
//    circle.setRadius(new Scanner(System.in).nextFloat());
//    System.out.println("Chu vi = " + circle.tinhChuVi());
//    System.out.println("Dien tich = " + circle.tinhDienTich());

// Cach 2
    System.out.println("Nhap ban kinh hinh tron: ");
    float banKinh = new Scanner(System.in).nextInt();
    Circle circle = new Circle(banKinh);
    System.out.println("Chu Vi = " + circle.tinhChuVi());
    System.out.println("Dien Tich = " + circle.tinhDienTich());
  }

}
