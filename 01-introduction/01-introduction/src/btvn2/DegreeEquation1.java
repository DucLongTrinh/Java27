package btvn2;

import java.util.Scanner;

public class DegreeEquation1 {
    public static void main(String[] args) {
        Scanner docDuLieu = new Scanner(System.in);

        System.out.println("Nhập dữ liệu của a: ");
        double a = docDuLieu.nextDouble();

        System.out.println("Nhập dữ liệu của b: ");
        double b = docDuLieu.nextDouble();

        double x = (a != 0) ? -b / a: Double.NaN;
        System.out.println("Nghiệm là x = " + x);
        docDuLieu.close();
    }
}
