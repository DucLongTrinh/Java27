package btvn2;

import java.util.Scanner;

public class DegreeEquation2 {
    public static void main(String[] args) {
        Scanner docDuLieu = new Scanner(System.in);

        System.out.println("Nhập giá trị của a");
        double a = docDuLieu.nextDouble();

        System.out.println("Nhập giá trị của b");
        double b = docDuLieu.nextDouble();

        System.out.println("Nhập giá trị của c");
        double c = docDuLieu.nextDouble();

        double delta = b*b - 4 * a * c;

        double x1 = (a !=0 && delta >= 0) ? (-b + Math.sqrt(delta)) / (2*a) : Double.NaN;
        double x2 = (a !=0 && delta >= 0) ? (-b - Math.sqrt(delta)) / (2*a) : Double.NaN;

        System.out.println("x1=" + x1);
        System.out.println("x2=" + x2);
    }
}