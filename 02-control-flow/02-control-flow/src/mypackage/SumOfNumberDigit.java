package mypackage;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SumOfNumberDigit {

  public static void main(String[] args) {
    System.out.println("Nhap N: ");
    int n = new Scanner(System.in).nextInt();

    int S = 0;
    while (n > 0) {
      S += n % 10;
      n /= 10;
    }
    System.out.println(S);
  }
}
