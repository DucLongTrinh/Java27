package mypackage;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PrimeNumber {

    // n = 984562 ==> S = 9 + 8 + 4 + 5 + 6 + 2
    public static void main(String[] args) {
        System.out.print("Nhập vào số n: ");
        int n = new Scanner(System.in).nextInt();
        // kiểm tra xem N có phải là số nguyên tố
        // SNT là số chỉ có ước là 1 và chính nó
        // ==> N chỉ chia hết cho 1 và chính nó, không chia hết cho thằng nào khác

        boolean ketQua = isPrimeNumber(n);
//        if (!ketQua) {
//            System.out.println("Không là số nguyên tố");
//        } else {
//            System.out.println("Là số nguyên tố");
//        }

//        if (!ketQua) {
//            System.out.println("Không là số nguyên tố");
//            return;
//        }
//        System.out.println("Là số nguyên tố");

//        String message = !ketQua ? "Không là số nguyên tố" : "Là số nguyên tố";
//        System.out.println(message);

        System.out.println(ketQua ? "Là số nguyên tố" : "Không là số nguyên tố");
    }

    public static boolean isPrimeNumber(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeNumber1(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeNumber2(int n) {
        if (n == 2 || n == 3 || n == 5 || n == 7) {
            return true;
        }
        double sqrt = Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}