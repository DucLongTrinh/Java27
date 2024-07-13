package democircle;

import java.util.Scanner;
import javax.sound.midi.Soundbank;

public class Main {

  public static void main(String[] args) {

    Circle c1 = new Circle();
    System.out.println("Nhap ban kinh: ");
    c1.radius = new Scanner(System.in).nextFloat();
    System.out.println("Chu vi = " + c1.tinhChuVi());
    System.out.println("Dien Tich = " + c1.tinhDienTich());

  }

}
