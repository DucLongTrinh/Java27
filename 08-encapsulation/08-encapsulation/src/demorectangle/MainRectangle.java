package demorectangle;

import democircle.Circle;
import java.util.Scanner;

public class MainRectangle {

  public static void main(String[] args) {

    System.out.println("Nhap chieu dai: ");
    float chieuDai = new Scanner(System.in).nextInt();

    System.out.println("Nhap chieu rong: ");
    float chieuRong = new Scanner(System.in).nextInt();

    Rectangle retangle = new Rectangle(chieuDai, chieuRong);


    System.out.printf("Chu Vi = " + retangle.tinhChuVi());
    System.out.printf("Dien Tich = " + retangle.tinhDienTich());
  }


}
