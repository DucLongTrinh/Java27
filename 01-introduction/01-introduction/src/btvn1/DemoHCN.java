package btvn1;

public class DemoHCN {
    public static void main(String[] args) {
        double chieuDai = 2.0;
        double chieuRong = 6.0;

        double chuVi = 2 * (chieuDai + chieuRong);
        double dienTich = chieuDai * chieuRong;

        System.out.println("Chu vi của hình chữ nhật là: " + chuVi);
        System.out.println("Diện tích của hình chữ nhật là: " + dienTich);
    }

    public static class DemoCircle {
        public static void main(String[] args) {
            double banKinh = 2;

            double chuVi = 2 * Math.PI * banKinh;
            double dienTich = Math.PI * banKinh * banKinh;

            System.out.println("Chu vi hình tròn là: " + chuVi);
            System.out.println("Diện tích hình tròn là: " + dienTich);
        }
    }
}
