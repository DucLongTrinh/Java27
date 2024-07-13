import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import javax.sound.midi.Soundbank;

public class Main01 {

  public static void main(String[] args) {

    Car audi = new Car();

    Student sv1 = new Student();

    int[] arr = new int[10];
    arr[0] = 1;
    System.out.println(arr[0]);
    System.out.println(Arrays.toString(arr));

    Student sv2 = new Student();
    sv1.name = "Nguyen Van A";
    sv1.id = "16ABCD";
    sv1.gpa = 10;
    System.out.println(sv1);

    Car mec = new Car();
    mec.color = "black";
    mec.brand = "Mecerdes";
    mec.weelNumner = 4;
    mec.model = "Maybach";
    System.out.println(mec);
    System.out.println(mec.color + ", " + mec.brand);

    Scanner s = new Scanner(System.in);
    s.remove();

  }

}
