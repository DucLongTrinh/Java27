public class MultipleDimensionArrays {

    public static void main(String[] args) {
        int[] a1 = new int[10];


        // Mảng 2 chiều -  ma trận - bảng (Exel)
        int[][] a2 = new int [10][5]; // 10 dong, 5 cot
        int[][] a3 = new int [10][];  // 10 dong, ko biet bao nhieu cot


        // mảng 3 chiều
        int[][][] a4 = new int[10][5][6];

        // mảng 4 chiều
        int [][][][] a5 = new int[10][5][6][7];

        a2[0][0] = 50;
//        a2[9][7] = 100;
        int[] hangDauTien = a2[0];
        int[] hangThuHai = a2[1];

        System.out.println(a2.length);
        System.out.println(a2[1].length); //lấy số cột - số phần tử của 1 hàng thì là
        System.out.println(hangDauTien.length);
        System.out.println(hangThuHai.length);
        System.out.println("--------------");

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        for (int i = 0; i < arr.length; i++) {//chạy hết hàng
            for (int j = 0; j < arr[0].length; j++) {//chạy hết cột
                System.out.println(arr[i][j]);
                if (j < arr[0].length - 1) {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }


    }
}
