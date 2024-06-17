package btvn1;

public class DemoMaxNumber {
    public static void main(String[] args) {
        int a = 6;
        int b = 12;
        int c = 15;
        int d = 16;

        int maxNumber = Math.max(a, Math.max(b, Math.max(c,d)));

        System.out.println("Số lớn nhất trong 4 số là: " + maxNumber);
    }
}
