package mypackage;

import java.util.Scanner;

public class DemoSum1 {
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();

        int S = 0;
            while (n > 0) {
                int soDu = n % 10;
                S = S + soDu;
                n = n / 10;
            }
            System.out.println("S = " + S);
        }
    }




