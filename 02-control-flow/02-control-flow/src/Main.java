public class Main {
    public static void main(String[] args) {

//        int age = 10;


        double point = 10;
        if (point >= 8) {
            System.out.println("Hoc sinh gioi");
        }
        else if (point < 8 && point >= 6.5) {
            System.out.println("Hoc sinh kha");
        }
        else if (point < 6.5 && point >=5) {
            System.out.println("Hoc sinh trung binh");
        }
        else {
            System.out.println("Hoc sinh yeu");
        }
    }
}
