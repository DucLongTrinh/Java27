package mypackage;

import java.text.DecimalFormat;

public class IntegerDivisionRounding {
    public static void main(String[] args) {
        int num1 = 18;
        int num2 = 3;

        double quotient = (double) num1 / num2;

        DecimalFormat df = new DecimalFormat("#.###");
        quotient = Double.parseDouble(df.format(quotient));

        System.out.println("Thương của " + num1 + " và " + num2 + " là: " + quotient);
    }
}
