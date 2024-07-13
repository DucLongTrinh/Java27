package mypackage;

public class DemoOverload {
    public static void main(String[] args) {

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b;
    }

    public static int sum() {
        return 0;
    }
}
