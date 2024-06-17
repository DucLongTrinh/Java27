import java.util.Scanner;

public class DemoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao n: ");
        int n = input.nextInt();

//        int S = 0;
//        for (int i = 1; i<=n; i++) {
//            if (i % 2 ==0) {
//                S = S + i;
//            }
//        }

//        int S = 0;
//        int i = 1;
//        while (i<=n) {
//            if (i%2 ==0) {
//                S += i;
//            }
//            i++;
//        }

        int S = 0;
        int i = 1;
        do {
            if (i%2 == 0) {
                S += i;
            }
            i++;
        } while (i <=n);

        System.out.printf("Tong cac so chan tu 1 den " + n + "la: " + S);
    }
}