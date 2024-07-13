public class DemoOverload {

  // Overloading

  public static void main(String[] args) {
    System.out.println(1);
    System.out.println("Hello World");
    System.out.println('d');
    System.out.println(5.5);
    System.out.println(true);

    demo(4, 5);
    demo(4, 5, 6);
    demo();
    demo(5.5f, 10);

  }

  public static float demo(int a, int b) {
    return a + b;
  }

  public static float demo(int a, int b, int c) {
    return a + b;
  }

  public static int demo() {
    return 0;
  }

  public static float demo(float a, int b) {
    return a + b;
  }
  
}
