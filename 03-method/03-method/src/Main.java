import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("111111");
        // lời gọi hàm
        System.out.println("Nhập số thứ nhất: ");
        int x = new Scanner(System.in).nextInt(); // 5
        System.out.println("Nhập số thứ hai: ");
        int y = new Scanner(System.in).nextInt(); // 15
        sum1(x, y);
        int ketQua = sum2(x, y);
        sum3(x, y, 10);
        demo();
//        int e = 5
        System.out.println("Ket qua khi goi ham sum2: " + ketQua);
        System.out.println("Xong");
    }

    public static void sum1(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public static int sum2(int a, int b) {
//        int c = a + b;
//        return c;
        return a + b;
    }

    public static int sum3(int a, int b, int c) {
//        int kq = a + b + c;
//        return kq;
        return a + b + c;
    }

    public static void demo() {
        System.out.println("Demo một cái hàm gì đấy");
    }

//    public int demo01(int b) {
//
//    }
//
//    public int demo02() {
//
//    }
//
//    public int demo03(String s, float f, double d, char c) {
//
//    }
}