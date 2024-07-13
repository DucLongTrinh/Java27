package democircle;

import java.util.Scanner;

public class MainCircle {

  public static void main(String[] args) {

    System.out.printf("Nhap ban kinh hinh tron: ");
    float banKinh = new Scanner(System.in).nextInt();
    Circle circle = new Circle(banKinh);
    System.out.printf("Chu Vi = " + circle.tinhChuVi());
    System.out.printf("Dien Tich = " + circle.tinhDienTich());
  }

}
