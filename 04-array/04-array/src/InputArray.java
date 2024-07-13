import java.util.Arrays;
import java.util.Scanner;

public class InputArray {

    public static void main(String[] args) {
        System.out.printf("Nhap vao so luong phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();

        int [] myArray = new int[n];

        for (int i = 0; i < n ; i++) {
            System.out.println("a[" + i + "] = ");
            System.out.println("Nhap gia tri cho phan tu thu " + i + ": ");
            myArray[i] = new Scanner(System.in).nextInt();
        }
        System.out.printf(Arrays.toString(myArray));
    }
}
