package mypackage;

public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        int a = 5, b = 10, c = -7;
        float delta = b*b - 4 *a * c;
        // square root ==> căn bậc 2 (sqrt)
        double x1 = (-b + Math.sqrt(delta)) / (2*a);
        double x2 = (-b - Math.sqrt(delta)) / (2*a);
      System.out.println("x1=" + x1);
      System.out.println("x2=" + x2);
    }
}
