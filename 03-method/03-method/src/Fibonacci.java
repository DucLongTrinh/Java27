public class Fibonacci {

    //  Sử dụng đệ quy để giải bài toán số Fibbonacci:
    //  Fn = Fn-1 + Fn-2 với n >= 2,
    //  F0 = F1 = 1

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
