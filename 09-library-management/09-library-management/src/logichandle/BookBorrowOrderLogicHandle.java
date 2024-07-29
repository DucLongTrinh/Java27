package logichandle;

import entity.Book;
import entity.BookBorrowOrder;
import entity.BookBorrowOrderDetail;
import entity.Reader;
import java.util.Scanner;

public class BookBorrowOrderLogicHandle {

  private final BookBorrowOrder[] orders = new BookBorrowOrder[1000]; // Danh sách lượt mượn sách

  // Dependency injection
  private final BookLogicHandle bookLogicHandle;
  private final ReaderLogicHandle readerLogicHandle;

  public BookBorrowOrderLogicHandle(BookLogicHandle bookLogicHandle,
      ReaderLogicHandle readerLogicHandle) {
    this.bookLogicHandle = bookLogicHandle;
    this.readerLogicHandle = readerLogicHandle;
  }

  public void printBookBorrowOrders() {
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

  public void createBookBorrowOrders() {
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

    // Kiểm tra xem thư viện có bạn đọc và sách chưa?
    boolean coBanDocHayChua = readerLogicHandle.CheckCoBanDocHayChua();
    boolean coSachHayChua = bookLogicHandle.checkCoSachHayChua();

    if (!coBanDocHayChua || !coSachHayChua) {
      System.out.println("Chưa có đủ dữ liệu về bạn đọc và/hoặc sách để thực hiện mượn. "
          + "Vui lòng nhập thông tin của bạn đọc và sách trước khi mượn");
      return;
    }

    System.out.print("Có bao nhiêu bạn đọc đang cần mượn sách: ");
    int readerNumber;
    while (true) {
      readerNumber = new Scanner(System.in).nextInt();
      if (readerNumber > 0 && readerNumber <= readerLogicHandle.getReadersLength()) {
        break;
      }
      System.out.println("Số lượng bạn đọc không hợp lệ, vui lòng nhập lại: ");
    }
    for (int i = 0; i < readerNumber; i++) {
      // với từng bạn đọc hỏi các thông tin trên (bạn là ai, details = [mượn các đầu sách nào, từng đầu sách mượn bao nhiêu cuốn or quyển])
      System.out.println("Nhập thông tin id của bạn đọc thứ " + (i + 1) + ": ");

      Reader reader = truyVanBanDoc();

      BookBorrowOrderDetail[] details = khaiBaoThongTinSachMuon();

      // Tạo lượt mượn sách order
      BookBorrowOrder order = new BookBorrowOrder(reader,
          details); // lượt mượn sách hay phiếu mượn sách
      // lưu phiếu mượn sách vào danh sách các lượt mượn ở dòng 8 để lần sau xem lại
      saveOrder(order);
    }
  }

  public void saveOrder(BookBorrowOrder order) {
    for (int j = 0; j < orders.length; j++) {
      if (orders[j] != null) {
        continue;
      }
      orders[j] = order;    // orders[j] = null thì thêm vào order
      break;
    }  // Được 80% của ý thứ 3.	Khai báo lớp QL Mượn sách ở switch/case 5, sau đó cần in ra ở switch/case 6...
  }

  public BookBorrowOrderDetail[] khaiBaoThongTinSachMuon() {
    System.out.println("Bạn đọc này muốn mượn bao nhiêu dòng đầu sách: ");
    int bookNumber = 0;
    while (true) {
      bookNumber = new Scanner(System.in).nextInt();
      if (bookNumber > 0 && bookNumber <= bookLogicHandle.getBooksLength()) {
        break;
      }
      System.out.println("Số sách muốn mượn không hợp lệ, vui lòng nhập lại: ");
    }
    BookBorrowOrderDetail[] details = new BookBorrowOrderDetail[bookNumber];  // số lượng dòng sách = số phần tử của mảng details
    int tongSach = 0;
    int count = 0;
    for (int j = 0; j < bookNumber; j++) {
      System.out.println("Nhập id của đầu sách thứ " + (j + 1)
          + ": "); // Nhập id vì thực tế id chính là số serial giúp xác định đúng là sách của thư viện

      Book book = null;
      while (true) { // giúp xác định được thông tin bạn mượn đúng các đầu sách nào ? (trong thư viện)
        int bookId = new Scanner(System.in).nextInt();
        // xác định xem Id của sách kia có tồn tại trong thư viện không
        book = bookLogicHandle.searchBookById(bookId);
        if (book != null) {
          break;
        }
        System.out.println("Không có sách nào khớp với id sách vừa nhập, vui lòng nhập lại: ");
      } // giúp xác định được thông tin bạn mượn đúng các đầu sách nào ? (trong thư viện)

      System.out.println("Đầu sách '" + book.getName() + "' này bạn muốn mượn bao nhiêu cuốn");
      int quantity = new Scanner(System.in).nextInt();
      tongSach += quantity;
      BookBorrowOrderDetail detail = new BookBorrowOrderDetail(book, quantity);  // mỗi detail bao gồm thông tin mỗi đầu sách "book" + số lượng "quantity" mượn đối với đầu sách đó
      details[count] = detail;   // count là biến con chạy giá trị thuộc [0; bookNumber -1]
      count++;
    }     // giúp define được details
    return details;
  }

  public Reader truyVanBanDoc() {
    Reader reader = null;
    while (true) {  // giúp xác định được thông tin trả lời câu hỏi bạn đọc là ai?
      int readerId = new Scanner(System.in).nextInt();

      // Tìm xem trong thư viện có bạn đọc nào có id match với Id vừa nhập không
      reader = readerLogicHandle.searchReaderById(readerId);
      if (reader != null) {
        break;
      }
      System.out.print("Không có bạn đọc nào mang mã (id) vừa nhập, vui lòng nhập lại ");
    } // giúp xác định được thông tin trả lời câu hỏi bạn đọc reader là ai?
    return reader;
  }


  public void searchByReaderName() {
    System.out.println("Nhập vào tên bạn đọc muốn tìm kiếm: ");
    String readerName = new Scanner(System.in).nextLine();
    for (int i = 0; i < orders.length; i++) {
      // reader = "Nguyễn Văn A" => nguyễn văn a
      // Người ta nhập = "A" => a
      if (orders[i] != null
          && orders[i].getReader().getName().toLowerCase().contains(readerName.toLowerCase())) {
        System.out.println(orders[i]);
      }
    }
  }

  public void sort() {
    while (true) {
      System.out.println("1. Sắp xếp theo tên bạn đọc");
      System.out.println("2. Sắp xếp theo số lượng cuốn sách được mượn");
      System.out.println("3. Quay lại menu tổng");
      System.out.println("Chọn 1. hoặc 2.");
      int functionChoice;
      while (true) {
        functionChoice = new Scanner(System.in).nextInt();
        if (functionChoice >= 1 && functionChoice <= 3) {
          break; // Thoát ra khỏi vòng lặp gần nhất while (true), đi kiểm tra các chức năng ở switch(functionChoice) là gì và thực hiện chức năng
        }
        System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
      }
      switch (functionChoice) {
        case 1:
          sortByReaderName();
          printBookBorrowOrders();
          break;
        case 2:
          sortByBookQuantity();
          printBookBorrowOrders();
          break;
        case 3:
          break;
      }
    }
  }

  private void sortByBookQuantity() {
    for (int i = 0; i < orders.length; i++) {
      if (orders[i] == null) {
        continue;
      }
      for (int j = 0; j < orders.length; j++) {
        if (orders[j] == null) {
          continue;
        }

        if (orders[i].getTotalQuantity() > orders[j].getTotalQuantity()) {
          BookBorrowOrder temp = orders[j];
          orders[j] = orders[i];
          orders[i] = temp;
        }
      }
    }
  }

  private void sortByReaderName() {
    for (int i = 0; i < orders.length; i++) {
      if (orders[i] == null) {
        continue;
      }
      for (int j = 0; j < orders.length; j++) {
        if (orders[j] == null) {
          continue;
        }
        String readerName1 = orders[i].getReader().getName().toLowerCase();
        String readerName2 = orders[j].getReader().getName().toLowerCase();
        /**
         * Khi A compareTo với B
         * Nếu kết quả là 1 số dương thì A > B
         * Nếu kết quả là 1 số âm thì A < B
         * Nếu kết quả là 0 thì A = B
         */
        if (readerName1.compareTo(readerName2) > 0) {
          BookBorrowOrder temp = orders[j];
          orders[j] = orders[i];
          orders[i] = temp;
        }
      }
    }
  }
}
