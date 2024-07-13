package mypackage;

import java.util.Scanner;

public class Demo01 {

    public static void main(String[] args) {
        System.out.print("Nhập a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhập b: ");
        int b = new Scanner(System.in).nextInt();
        System.out.printf("Nhap c: ");
        int c = new Scanner(System.in).nextInt();
        System.out.printf("So lon nhat la: " + Math.max(c,Math.max(a, b)));

        if (a>b) {
            System.out.println(a + " lớn hơn " + b);
        }
        else if (a<b) {
            System.out.println(a + " nhỏ hơn " + b);
        }
        else {
            System.out.println(a + " bằng " + b);

        }

        String kq = a > b ? "a lớn hơn b" : (a < b ? " a nhỏ hơn b" : " Hai số bằng nhau");
        System.out.printf(kq);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                continue;
//                System.out.printf("1111");
            }
            System.out.println("1256789");
        }

        for (int i = 0; i < 10; i++) {

        }
        for (int i = 0; i < 10; i++) {

        }

    }
}
