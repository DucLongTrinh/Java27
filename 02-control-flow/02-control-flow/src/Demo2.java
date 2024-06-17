import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Nhập vào 3 số nguyên a, b, c
        System.out.print("Nhập số nguyên a: ");
        int a = input.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = input.nextInt();
        System.out.print("Nhập số nguyên c: ");
        int c = input.nextInt();
//        int max = a;
//        if (b > a) {
//            max = b;
//        }
//        if (c > b) {
//            max = c;
//        }

        // Tìm số lớn nhất và in ra màn hình
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Số lớn nhất trong ba số " + a + ", " + b + ", " + c + " là: " + max);
    }
}
