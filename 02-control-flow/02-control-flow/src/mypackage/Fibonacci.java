package mypackage;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}


// cach 2: list chuỗi fibonacci
//public class Fibonacci {
//    public static void main(String[] args) {
//        int n = 10; // Specify the value of n here
//
//        System.out.print("Fibonacci series up to n = " + n + " : ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(fibonacciRecursion(i) + " ");
//        }
//    }
//
//    public static int fibonacciRecursion(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
//        }
//    }
//}