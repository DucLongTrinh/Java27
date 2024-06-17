package mypackage;

public class DemoCircle {
    public static void main(String[] args) {
        double banKinh = 2;

        double chuVi = 2 * Math.PI * banKinh;
        double dienTich = Math.PI * banKinh * banKinh;

        System.out.println("Chu vi hình tròn là: " + chuVi);
        System.out.println("Diện tích hình tròn là: " + dienTich);
    }
}
