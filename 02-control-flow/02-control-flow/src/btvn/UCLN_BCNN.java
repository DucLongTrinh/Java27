public class UCLN_BCNN {

    public static void main(String[] args) {
        int a = 20;
        int b = 50;

        // Tim Uoc so chung lon nhat
        int ucln = 1;
        int smaller = (a < b) ? a : b;
        for (int i = 1; i <= smaller; i++) {
            if (a % i == 0 && b % i == 0) {
                ucln = i;
            }
        }

        System.out.println("Ước số chung lớn nhất của " + a + " và " + b + " là: " + ucln);

        // Tim Boi so chung nho nhat
        int bcnn;
        int greater = (a > b) ? a : b;
        for (bcnn = greater; ; bcnn += greater) {
            if (bcnn % a == 0 && bcnn % b == 0) {
                break;
            }
        }

        System.out.println("Bội số chung nhỏ nhất của " + a + " và " + b + " là: " + bcnn);
    }
}