package demohcn;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Rectangle hcn1 = new Rectangle();
    System.out.println("Nhap chieu dai: ");
    hcn1.width = new Scanner(System.in).nextFloat();

    System.out.println("Nhap chieu rong: ");
    hcn1.height = new Scanner(System.in).nextFloat();

    System.out.println("Chu vi = " + hcn1.tinhChuVi());
    System.out.println("Dien Tich = " + hcn1.tinhDienTich());

    System.out.println("-----------------");
    System.out.println("Nhap chieu dai: ");
    float dai = new Scanner(System.in).nextFloat();

    System.out.println("Nhap chieu rong: ");
    float rong = new Scanner(System.in).nextFloat();

    Rectangle hcn2 = new Rectangle(dai, rong);

    System.out.println("Chu vi = " + hcn2.tinhChuVi());
    System.out.println("Dien Tich = " + hcn2.tinhDienTich());

  }

}
