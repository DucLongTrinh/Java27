import java.util.Scanner;

public class DemoFor {
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();

        int S = 0;
        for (int i = 1; i <= n; i++) {
//            S = S + i;
            S += i;
        }
        System.out.println("Ket qua: " + S);
    }
}
