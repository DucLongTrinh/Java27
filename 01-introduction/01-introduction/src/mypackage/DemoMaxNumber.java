package mypackage;

public class DemoMaxNumber {
    public static void main(String[] args) {
        int number1 = 6;
        int number2 = 12;
        int number3 = 15;
        int number5 = 16;

        int maxNumber = number1;
        if (number2 > number1) {
            maxNumber = number2;
        }
        if (number3 > number2) {
            maxNumber = number3;
        }
        if (number5 > number3) {
            maxNumber = number5;
        }

        System.out.println("Số lớn nhất trong 4 số là: " + maxNumber);
    }
}
