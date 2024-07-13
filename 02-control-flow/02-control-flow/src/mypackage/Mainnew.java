package mypackage;

import java.util.Scanner;

public class Mainnew {
    public static void main(String[] args) {
        System.out.printf("Nhap so thu nhat: ");
        int x = new Scanner(System.in).nextInt(); // 5
        System.out.printf("Nhap so thu hai: ");
        int y = new Scanner(System.in).nextInt(); // 15
        sum1 (x, y);
        int ketQua = sum2 (x, y);
        sum3(x, y, 10);
        System.out.printf("Ket qua khi goi ham sum2: " + ketQua);
        System.out.println("xong");
    }

    public static void sum1(int a, int b) { // Truyền giá trị của x và y và coi nó tương ứng là a và b
        int c = a + b;
        System.out.println(c);
        return;  // co the bypass
    }

    public static int sum2(int a, int b) {
        int c = a + b;
//        return c;
        return a + b;
    }

    public static int sum3(int a, int b, int c) {
        int kq = a + b + c ;
        System.out.println(kq);
        return kq;
    }
}
