package mypackage;

import java.util.Scanner;

public class DemoSwitch2 {

  public static void main(String[] args) {
    int x = new Scanner(System.in).nextInt();
    if (x==2) {
      System.out.println("Thứ 2");
    } else if (x==3) {
      System.out.println("Thứ 3");
    } else if (x==4) {
      System.out.println("Thứ 4");
    } else if (x==5) {
      System.out.println("Thứ 5");
    } else if (x==6) {
      System.out.println("Thứ 6");
    } else if (x==7) {
      System.out.println("Thứ 7");
    } else if (x==8) {
      System.out.println("Chủ nhật");
    } else {
      System.out.println("Không hợp lệ");
    }

  }
}
