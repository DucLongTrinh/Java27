import java.util.Arrays;
import java.util.Scanner;

public class ArrayCalculator {
    public static void main(String[] args) {

        int[] myArray = inputArray();
        System.out.println(Arrays.toString(myArray));

        int Tong = sumArray(myArray);
        System.out.println("Tong = " + Tong);
        System.out.println("Trung binh cong = " + (float) Tong / myArray.length);
    }

    public static int sumArray(int[] arr) {
        int S = 0;
        for (int i = 0; i < arr.length; i++) {
            S += arr[i];
        }
        return S;
    }

    public static int[] inputArray() {
        System.out.print("Nhap vao so luong phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();

        int[] myArray = new int[n];

        for (int i = 0; i < n; i++) {
//            System.out.println("a[" + i + "] = ");
            System.out.println("Nhap gia tri cho phan tu thu " + i + ": ");
            myArray[i] = new Scanner(System.in).nextInt();
        }
        return myArray;
    }
}

