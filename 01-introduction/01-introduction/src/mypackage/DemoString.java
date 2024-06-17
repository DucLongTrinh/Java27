package mypackage;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class DemoString {
    public static void main(String[] args) {
        String str1 = "Nguyen Van A";
        String str2 = "NGuyen Van A";
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.startsWith("n"));
        System.out.println(str1.contains("x"));
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        String[] strings = str2.split("V");
        System.out.println(Arrays.toString(strings));
        String s = "\"";
        System.out.println(s);
        int c = 5;
        Integer c1 = 5;

        long a = 1000;
        Long a1 = 1000L;

        float y = 0.2f;
        Float y1 = 0.2F;
    }
}
