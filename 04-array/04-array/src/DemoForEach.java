public class DemoForEach {

    public static void main(String[] args) {
        String[] names = {" Nguyen Van A", "Nguyen Van B", "Tran Thi C", "Vu Duc D"};

        for (int i = 0; i < names.length; i++) {
            String ten = names[i];
            System.out.println(ten);
        }

        for (int i = names.length - 1; i >= 0; i--) {
            String ten = names[i];
            System.out.println(ten);
        }

        // for-each
        for (String x : names) {
            System.out.println(x);
        }
    }
}
