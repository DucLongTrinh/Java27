import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        int[] mang = inputArray();

        System.out.print("Nhap so nguyen x: ");
        int x = new Scanner(System.in).nextInt();

        boolean daTimThayHayChua = false; //flag 
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] == x) {
                System.out.printf("Tim thay so " + x + " trong mang tai vi tri: " + i);
                daTimThayHayChua = true;
                break;
            }
        }
        if (!daTimThayHayChua) {
            System.out.println("Khong tim thay");
        }

    }

    public static int[] inputArray () {
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




