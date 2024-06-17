package btvn2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DemoHinhChuNhat {
    public static void main(String[] args) {
        Scanner nhapDuLieu = new Scanner(System.in);

        System.out.println("Nhập giá trị chiều dài a: ");
        double a = nhapDuLieu.nextDouble();

        System.out.println("Nhập giá trị chiều rộng b: ");
        double b = nhapDuLieu.nextDouble();

        double chuVi = 2 * (a + b);
        double dienTich = a * b;

        System.out.println("Chu vi của hình chữ nhật là: " + chuVi);
        System.out.printf("Diện tích của hình chữ nhật là: " + dienTich);
        nhapDuLieu.close();
    }
}

