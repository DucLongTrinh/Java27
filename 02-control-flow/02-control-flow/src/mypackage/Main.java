package mypackage;

public class Main {

    public static void main(String[] args) {
        int age = 11;
        if (age >= 18) {
            System.out.println("Đủ tuổi bầu cử");
        } else {
            System.out.println("Bạn chưa đủ tuổi bầu cử");
        }
        System.out.println("----------------");



        if (age >= 18) {
            System.out.println("Đủ tuổi bầu cử");
            double point = 10;
            if (point >= 8) {
                System.out.println("Học sinh giỏi");
                if (10 > 6) {
                    int a = 5;
                    int b = 6;
                    System.out.printf("a + b");
                }
            } else if (point < 8 && point >= 6.5) {
                System.out.println("Học sinh khá");
            } else if (point < 6.5 && point >5) {
                System.out.println("Học sinh trung bình");
            } else {
                System.out.println("Học sinh yếu");
            }
        }
        if (age < 18) {
            System.out.println("Bạn chưa đủ tuổi bầu cử");
        }
    }

}
