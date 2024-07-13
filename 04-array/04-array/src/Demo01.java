public class Demo01 {

    public static void main(String[] args) {
        int[] arr = new int[10];      // Khai báo mảng có tên arr, kiểu dữ liệu Int có 10 phần tử (element) tương ứng 10 chỗ trống (10 ô nhớ trên ram) để lưu 10 số nguyên Int
        System.out.println(arr[3]);  // In ra giá trị = 0 vì default Int có value = 0 (10 element Int giá trị mặc định all element đều = 0)
        arr[3] = 100;
        System.out.println(arr[3]);  // 100

        int a = arr[3];
        int x = 50;
        System.out.println("a = " + a);

        System.out.println(arr[9]);    // truy cập element thứ 10 (Index i = 9, start i = 0)
        System.out.println(arr.length); // trả vê độ dài mảng có tên arr
    }
}
