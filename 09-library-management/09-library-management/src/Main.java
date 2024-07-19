import java.util.Scanner;
import javax.swing.plaf.IconUIResource;

public class Main {

  private static Book[] books = new Book[1000]; //  đống sách trong thư viện
  private static Reader[] readers = new Reader[1000]; // Danh sách bạn đọc có trong thư viện
  private static BookBorrowOrder[] orders = new BookBorrowOrder[1000]; // Danh sách lượt mượn sách

  public static void main(String[] args) {

    menu();  // class Main call hàm menu()
  }

  private static void menu() {
    while (true) {
      printMenuOptions();
      // dùng while(true) thì vòng lặp là vô hạn lần vì vậy luôn cần điểm dừng ở case 8
      int functionChoice = chooseFunction();
      switch (functionChoice) {
        case 1:
          inputNewBook();
          break;
        case 2:
          printBooks();
          break;
        case 3:
          inputNewReader();
          break;
        case 4:
          printReaders();
          break;
        case 5:
          createBookBorrowOrders();
          break;
        case 6:     // 8 Points
          printBookBorrowOrders();
          break;
        case 7:
          System.out.println("Vào chức năng 7");
          break;
        case 8:
          return;
      }
    }
  }

  private static void printBookBorrowOrders() {
//    for (int i = 0; i < orders.length; i++) {
//      if (orders[i] == null) {
//        continue;
//      }
//      System.out.println(orders[i]); // in ra danh sách lượt mượn sách nếu != null
//    }

    for (BookBorrowOrder order : orders) {
      if (order == null) {
        continue;
      }
      System.out.println(order); // in ra danh sách lượt mượn sách nếu != null
    }
  }

  private static void createBookBorrowOrders() {
    /**
     * Có một loạt các bạn đọc đang xếp hàng chờ mượn sách
     * trên tay mỗi bạn có một vài cuốn sách
     *
     * Bạn là thủ thư, làm việc lần lượt với từng bạn đọc và hỏi các thông tin sau
     *  - Bạn là ai ?
     *  - Bạn mượn các đầu sách nào ?               // thuộc details
     *  - Từng đầu sách bạn mượn bao nhiêu cuốn ?   // thuộc details
     *
     *  Hỏi xong -> Tạo phiếu mượn sách -> lưu phiếu vào hệ thống
     *
     */

    System.out.print("Có bao nhiêu bạn đọc đang cần mượn sách: ");
    int readerNumber = new Scanner(System.in).nextInt();
    for (int i = 0; i < readerNumber; i++) {
      // với từng bạn đọc hỏi các thông tin trên (bạn là ai, details = [mượn các đầu sách nào, từng đầu sách mượn bao nhiêu cuốn or quyển])
      System.out.println("Nhập thông tin id của bạn đọc thứ " + (i + 1) + ": ");

      Reader reader = truyVanBanDoc();

      BookBorrowOrderDetail[] details = khaiBaoThongTinSachMuon();

      // Tạo lượt mượn sách order
      BookBorrowOrder order = new BookBorrowOrder(reader, details); // lượt mượn sách hay phiếu mượn sách
      // lưu phiếu mượn sách vào danh sách các lượt mượn ở dòng 8 để lần sau xem lại
      saveOrder(order);
    }
  }

  private static void saveOrder(BookBorrowOrder order) {
    for (int j = 0; j < orders.length; j++) {
      if (orders[j] != null) {
        continue;
      }
      orders[j] = order;    // orders[j] = null thì thêm vào order
      break;
    }  // Được 80% của ý thứ 3.	Khai báo lớp QL Mượn sách ở switch/case 5, sau đó cần in ra ở switch/case 6...
  }

  private static BookBorrowOrderDetail[] khaiBaoThongTinSachMuon() {
    System.out.println("Bạn đọc này muốn mượn bao nhiêu dòng đầu sách: ");
    int bookNumber = new Scanner(System.in).nextInt();
    BookBorrowOrderDetail[] details = new BookBorrowOrderDetail[bookNumber];  // số lượng dòng sách = số phần tử của mảng details
    int count = 0;
    for (int j = 0; j < bookNumber; j++) {
      System.out.println("Nhập id của đầu sách thứ " + (j + 1)
          + ": "); // Nhập id vì thực tế id chính là số serial giúp xác định đúng là sách của thư viện

      Book book = null;
      while (true) { // giúp xác định được thông tin bạn mượn đúng các đầu sách nào ? (trong thư viện)
        int bookId = new Scanner(System.in).nextInt();
        // xác định xem Id của sách kia có tồn tại trong thư viện không
        for (int k = 0; k < books.length; k++) {
          if (books[k] != null && bookId == books[k].getId()) {
            book = books[k];
            break;
          }
        }
        if (book != null) {
          break;
        }
        System.out.println("Không có sách nào khớp với id sách vừa nhập, vui lòng nhập lại: ");
      } // giúp xác định được thông tin bạn mượn đúng các đầu sách nào ? (trong thư viện)

      System.out.println("Đầu sách '" + book.getName() + "' này bạn muốn mượn bao nhiêu cuốn");
      int quantity = new Scanner(System.in).nextInt();
      BookBorrowOrderDetail detail = new BookBorrowOrderDetail(book,
          quantity);  // mỗi detail bao gồm thông tin mỗi đầu sách "book" + số lượng "quantity" mượn đối với đầu sách đó
      details[count] = detail;   // count là biến con chạy giá trị thuộc [0; bookNumber -1]
      count++;
    }     // giúp define được details
    return details;
  }

  private static Reader truyVanBanDoc() {
    Reader reader = null;
    while (true) {  // giúp xác định được thông tin trả lời câu hỏi bạn đọc là ai?
      int readerId = new Scanner(System.in).nextInt();

      // Tìm xem trong thư viện có bạn đọc nào có id match với Id vừa nhập không
      for (int j = 0; j < readers.length; j++) {
        if (readers[j] != null && readerId == readers[j].getId()) {
          reader = readers[j];
          break;
        }
      }
      if (reader != null) {
        break;
      }
      System.out.print("Không có baạn đọc nào mang mã (id) vừa nhập, vui lòng nhập lại ");
    } // giúp xác định được thông tin trả lời câu hỏi bạn đọc reader là ai?
    return reader;
  }

  private static void printReaders() {
    for (int i = 0; i < readers.length; i++) {
      if (readers[i] == null) {      // băng null thì bỏ qua
        continue;
      }
      System.out.println(readers[i]); // không bằng null in ra
    }
  }

  private static void inputNewReader() {
    System.out.println("Nhập số lượng bạn đọc muốn đăng ký tài khoản tại thư viện: ");
    int readerNumber = new Scanner(System.in).nextInt();
    for (int i = 0; i < readerNumber; i++) {
      System.out.println("Nhập thông tin cho bạn đọc thứ " + (i + 1));
      Reader reader = new Reader();
      reader.inputInfo();

      // Lưu bạn đọc
      saveReader(reader);
    }
  }

  private static void saveReader(Reader reader) {
//    for (int j = 0; j < readers.length;
//        j++) { // duyệt từ đầu đến cuối mảng (length), chỗ nào trống (null) thì điền sách vào
//      if (readers[j] == null) {
//        readers[j] = reader;
//        break;
//      }
//    }
    for (int j = 0; j < readers.length;
        j++) { // duyệt từ đầu đến cuối mảng (length), phần tử trong mảng không phải là null thì tiếp tục với phần tử tiếp theo
      if (readers[j] != null) {
        continue;
      }
      readers[j] = reader; // Ngược lại, nếu phần tử đó là null, thì gán giá trị của biến "reader" vào phần tử đó và thoát khỏi vòng lặp bằng cách sử dụng lệnh "break". Điều này giúp đưa dữ liệu vào vị trí trống đầu tiên trong mảng "readers".
      break;
    }
  }

  private static int chooseFunction() {
    System.out.println("Xin mời chọn chức năng: ");
    int functionChoice;
    while (true) {
      functionChoice = new Scanner(System.in).nextInt();
      if (functionChoice >= 1 && functionChoice <= 8) {
        break; // Thoát ra khỏi vòng lặp gần nhất while (true), đi kiểm tra các chức năng ở switch(functionChoice) là gì và thực hiện chức năng
      }
      System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
    }
    return functionChoice;
  }

  private static void printBooks() { // Print: Hiển thị danh sách các cuốn sách mà thư viện đang có
//    for (int i = 0; i < books.length; i++) {
//      if(books[i] != null) {        // không null thì in ra
//        System.out.println(books[i]);
//      }
//    }

    for (int i = 0; i < books.length; i++) {
      if (books[i] == null) {      // băng null thì bỏ qua
        continue;
      }
      System.out.println(books[i]); // không bằng null in ra
    }
  }

  private static void inputNewBook() {
    System.out.print("Nhập số lượng đầu sách muốn thêm mới: ");
    int bookNumber = new Scanner(System.in).nextInt();
    for (int i = 0; i < bookNumber; i++) {
      // Nhập thông tin cho từng đầu sách và lưu vào mảng books
      System.out.println("Nhập thông tin cho đầu sách thứ " + (i + 1));

      // Đây là nhập thông tin cho từng đầu sách
      Book book = new Book(); // tạo sách "book" và ID tự động tăng với AUTO_ID
      book.inputInfo();

      // Lưu vào mảng books, thực tế có thể đặt sách lên kệ
      saveBook(book);
    }
  }

  private static void saveBook(Book book) {
    for (int j = 0; j < books.length;
        j++) { // duyệt từ đầu đến cuối mảng (length), chỗ nào trống (null) thì điền sách vào
      if (books[j] == null) {
        books[j] = book;
        break;
      }
    }
  }

  private static void printMenuOptions() {

    // Trước tiên thực hiện in ra Menu lựa chọn
    System.out.println("========PHẦN MỀM QUẢN LÝ MƯỢN SÁCH THƯ VIỆN========");
    System.out.println("1. Thêm mới sách vào kho");
    System.out.println("2. Hiển thị danh sách các cuốn sách mà thư viện đang có");
    System.out.println("3. Đăng ký tài khoản cho bạn đọc mới");
    System.out.println("4. Hiển thị danh sách bạn đọc có trong thư viện");
    System.out.println("5. Lập bảng quản lý mượn sách");
    System.out.println("6. Sắp xếp bảng quản lý mượn sách");
    System.out.println("7. Tìm kiếm và hiển thị danh sách mượn sách theo tên bạn đọc");
    System.out.println("8. Thoát");
  }
}