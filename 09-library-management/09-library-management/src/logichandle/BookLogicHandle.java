package logichandle;

import entity.Book;
import java.util.Scanner;

public class BookLogicHandle {

  private final Book[] books = new Book[1000]; //  đống sách trong thư viện

  public int getBooksLength() {
    return books.length;
  }

  public void printBooks() {
//    for (int i = 0; i < books.length; i++) {
//      if(books[i] != null) {        // không null thì in ra
//        System.out.println(books[i]); // Print: Hiển thị danh sách các cuốn sách mà thư viện đang có
//      }
//    }

    for (int i = 0; i < books.length; i++) {
      if (books[i] == null) {      // băng null thì bỏ qua
        continue;
      }
      System.out.println(books[i]); // không bằng null in ra
    }
  }

  public void inputNewBook() {
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

  public void saveBook(Book book) {
    for (int j = 0; j < books.length;
        j++) { // duyệt từ đầu đến cuối mảng (length), chỗ nào trống (null) thì điền sách vào
      if (books[j] == null) {
        books[j] = book;
        break;
      }
    }
  }

  public boolean checkCoSachHayChua() {
    boolean coSachHayChua = false;
    for (int i = 0; i < books.length; i++) {
      if (books[i] != null) {
        coSachHayChua = true;
        break;
      }
    }
    return coSachHayChua;
  }

  public Book searchBookById(int bookId) {
    for (int k = 0; k < books.length; k++) {
      if (books[k] != null && bookId == books[k].getId()) {
        return books[k];
      }
    }
    return null;
  }

}
