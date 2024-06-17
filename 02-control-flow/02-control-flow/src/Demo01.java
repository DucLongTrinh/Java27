import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println("Nhap a");
        int a = new Scanner(System.in).nextInt();
        System.out.printf("Nhap b");
        int b = new Scanner(System.in).nextInt();
        if (a > b) {
            System.out.println(a  + " Lon hon " + b);
        }
        else if (a < b ) {
            System.out.printf(a + "Nho hon" + b);
        }
        else {
            System.out.println(a + "Bang" + b);
        }

        String kq = a > b ? "a lon hon b" : (a< b ? " a nho hon b" : "hai so bang nhau");
        System.out.println(kq);
    }
}
