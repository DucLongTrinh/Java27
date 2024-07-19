import java.util.Arrays;

public class BookBorrowOrder {

  private Reader reader;  // bạn đọc mượn
  private BookBorrowOrderDetail[] details;   // Mảng detail sẽ lưu tất cả các detail (detail = book + quantity)

  public BookBorrowOrder(Reader reader, BookBorrowOrderDetail[] details) {
    this.reader = reader;
    this.details = details;
  }

  /**
   *
   * reader = A
   * details = [
   *     {book = Lập trình Java, quantity = 1}
   *     {book = Cơ sở dữ liệu, quantity = 2}
   *  ]
   *
   *
   */



  public Reader getReader() {
    return reader;
  }

  public void setReader(Reader reader) {
    this.reader = reader;
  }

  public BookBorrowOrderDetail[] getDetails() {
    return details;
  }

  public void setDetails(BookBorrowOrderDetail[] details) {
    this.details = details;
  }

  @Override
  public String toString() {
    return "BookBorrowOrder{" +
        "reader=" + reader +
        ", details=" + Arrays.toString(details) +
        '}';
  }
}


