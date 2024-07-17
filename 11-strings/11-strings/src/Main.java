public class Main {

  public static void main(String[] args) {
    int z = 5; // số chuyển sang hệ cơ số 2 -> lưu vào bộ nhớ (RAM, DISK (HDD, SSD))
    char x ='a'; // 'a' => chuyển thành số mới chuyển sang hệ cơ số 2 => lưu vào bộ nhớ (...)
    char zero = '0'; // 48 -> 011 0000 > lưu vào bộ nh
    System.out.println((int) zero);
//    System.out.println(zero);
    char c = 'ê';
    System.out.println((int) c);


    // wrapper class
    String name = "Nguyen Van A"; // string literal
    String name1 = new String("Nguyen Van A"); // string literal tu khoa new
    System.out.println(name.contains("a"));
}
}
