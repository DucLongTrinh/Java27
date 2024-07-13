import java.util.Scanner;

public class SumOfNumberDigit {

    // n = 987562 ==> S = 9 + 8 + 7 + 5 + 6 + 2
    public static void main(String[] args) {
        System.out.print("Nhập N: ");
        int n = new Scanner(System.in).nextInt();

        int tong = sumOfDigits(n);
        System.out.println(tong);
    }

    public static int sumOfDigits (int n) {
        int S = 0;
        while (n > 0) {
            S += n % 10;    // S = S + n % 10;
            n /= 10;        // n = n / 10;
        }
        return S;
    }
}
