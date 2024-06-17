package mypackage;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Random;

public class DemoMath {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(Math.sin(0));
        System.out.println(Math.cos(0));

        System.out.println("----------------------------");

        System.out.println(Math.log(3));
        System.out.println(Math.log10(3));

        Random random = new Random();
        int i = random.nextInt(10);
        System.out.println(i);
    }
}
