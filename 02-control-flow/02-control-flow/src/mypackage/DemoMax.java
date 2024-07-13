package mypackage;

import java.util.Scanner;

public class DemoMax {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Nhập số nguyên a: ");
    int a = input.nextInt();
    System.out.print("Nhập số nguyên b: ");
    int b = input.nextInt();
    System.out.print("Nhập số nguyên c: ");
    int c = input.nextInt();

    int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    System.out.println("Số lớn nhất trong ba số " + a + ", " + b + ", " + c + " là: " + max);
  }

}
