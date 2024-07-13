package mypackage;

import java.util.Scanner;

public class DemoFor {
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();

        int S = 0;
        int i = 1;
        for (; ; ) {
            if (i > n) {
                break;
            }
//            S = S + i;
            S += i;
            i++;
        }

        while (i <= n) {
//            S = S + i;
            S += i;
            i++;
        }
        System.out.println("Ket qua: " + S);

    }
}
