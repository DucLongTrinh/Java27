package entity;

public class BookBorrowOrderDetail {  // 2 thuộc tính bên dưới hội đủ 1 lượt mượn sách

  private Book book;  // nhiều đầu sách (hay dòng sách)
  private int quantity; // số lượng tương ứng cho mỗi dòng sách ở trên

  public BookBorrowOrderDetail(Book book, int quantity) {  // tạo constructor
    this.book = book;
    this.quantity = quantity;
  }

  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "entity.BookBorrowOrderDetail{" +
        "book=" + book +
        ", quantity=" + quantity +
        '}';
  }
}
