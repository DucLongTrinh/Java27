import java.util.Arrays;
import java.util.zip.ZipFile;

public class ArrayIteration {

    public static void main(String[] args) {
        String[] names = new String[10];
        names[0] = "John";
        names[1] = "James";
        names[2] = "Paul";
        names[3] = "Bruce";

        int x = 5;
        System.out.println(x);

        for (int i = 0; i < names.length; i++) { // duyệt từ First element đến Final Element của mảng
            System.out.println(names[i]);
        }

        System.out.println("-------------------------");
        for (int i = names.length - 1; i >= 0; i--) { // duyệt từ Final Element lên First element của mảng (ngược lại)
            System.out.println(names[i]);
        }

        // System.out.println(names);  // value: [Ljava.lang.String;@eed1f14 ==> địa chỉ 1 ô nhớ trên RAM (KHÔNG NÊN DÙNG CÁCH IN NÀY)
        // + Chúng ta có thể sử dụng cách duyệt mảng (use for) để hiển thị lần lượt từ đầu cho tới cuối các phần tử trong mảng, hoặc sử dụng method Arrays.toString()

        System.out.println("++++++++++++++++++");
        System.out.println(Arrays.toString(names));
        System.out.println("++++++++++++++++++");
        System.out.print("[");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
            if (i != names.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

}

// Note:
// + kết quả in ra là null là chưa có giá trị
