import java.util.Scanner;

public class DemoSwitch {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        switch (x) {
            case 2:
                System.out.printf("Thu 2");
                break;
            case 3:
                System.out.printf("Thu 3");
                break;
            case 4:
                System.out.printf("Thu 4");
                break;
            case 5:
                System.out.printf("Thu 5");
                break;
            case 6:
                System.out.printf("Thu 6");
                break;
            case 7:
                System.out.printf("Thu 7");
                break;
            case 8:
                System.out.printf("Chu nhat");
                break;
            default:
                System.out.printf("khong hop le");
                break;
        }
    }
}
