package mypackage;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        System.out.println("Xin moi nhap so nguyen a");
        int a = new Scanner(System.in).nextInt();

        System.out.println("Xin moi nhap so nguyen b");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Tong = " + (a+b));

        System.out.println("Xin moi nhap ten");
        Scanner docDuLieu = new Scanner(System.in);
        String line = docDuLieu.nextLine();
        System.out.println(line);
    }
}
