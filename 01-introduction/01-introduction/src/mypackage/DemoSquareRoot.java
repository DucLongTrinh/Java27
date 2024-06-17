package mypackage;

import java.text.DecimalFormat;

public class DemoSquareRoot {
    public static void main(String[] args) {
        double number = 81;

        double squareRoot = Math.sqrt(number);
        DecimalFormat df = new DecimalFormat("#.###");
        squareRoot = Double.parseDouble(df.format(squareRoot));

        System.out.println("Căn bậc 2 của " + number + " là: " + squareRoot);
    }
}
