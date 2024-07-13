public class DemoRecursion {

    //  Sử dụng đệ quy để giải bài toán số Fibbonacci:
    //  Fn = Fn-1 + Fn-2 với n >= 2,
    //  F0 = F1 = 1

    /**
     * a ^ n = a.a.a.a.a.....a (N số a nhân với nhau)
     * a ^ n = a ^ (n-1) * a
     * a ^ (n-1) = a ^ (n-2) * a
     * a ^ (n-2) = a ^ (n-3) * a
     * a ^ 1 = a ^ 0 * a =  a
     * a ^ 0 = 1
     */

    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }

    public static long power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return power(a, b-1) * a;
    }
}
