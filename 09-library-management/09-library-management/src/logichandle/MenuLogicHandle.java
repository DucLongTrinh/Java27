package logichandle;

import java.util.Scanner;

public class MenuLogicHandle {

  private static final BookLogicHandle bookLogicHandle = new BookLogicHandle();
  private static final ReaderLogicHandle readerLogicHandle = new ReaderLogicHandle();
  private static final BookBorrowOrderLogicHandle bookBorrowOrderLogicHandle = new BookBorrowOrderLogicHandle(bookLogicHandle, readerLogicHandle);
//  private static final BookBorrowOrderLogicHandle bookBorrowOrderLogicHandle = new BookBorrowOrderLogicHandle();

  public void menu() {
    while (true) {
      printMenuOptions();
      // dùng while(true) thì vòng lặp là vô hạn lần vì vậy luôn cần điểm dừng ở case 8
      int functionChoice = chooseFunction();
      switch (functionChoice) {
        case 1:
          bookLogicHandle.inputNewBook();
          break;
        case 2:
          bookLogicHandle.printBooks();
          break;
        case 3:
          readerLogicHandle.inputNewReader();
          break;
        case 4:
          readerLogicHandle.printReaders();
          break;
        case 5:
          bookBorrowOrderLogicHandle.createBookBorrowOrders();
          break;
        case 6:     // 8 Points
          bookBorrowOrderLogicHandle.printBookBorrowOrders();
          break;
        case 7:
          bookBorrowOrderLogicHandle.sort();
          break;
        case 8:
          bookBorrowOrderLogicHandle.searchByReaderName();
          break;
        case 9:
          return;
      }
    }
  }


  private int chooseFunction() {
    System.out.println("Xin mời chọn chức năng: ");
    int functionChoice;
    while (true) {
      functionChoice = new Scanner(System.in).nextInt();
      if (functionChoice >= 1 && functionChoice <= 9) {
        break; // Thoát ra khỏi vòng lặp gần nhất while (true), đi kiểm tra các chức năng ở switch(functionChoice) là gì và thực hiện chức năng
      }
      System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
    }
    return functionChoice;
  }


  private void printMenuOptions() {

    // Trước tiên thực hiện in ra Menu lựa chọn
    System.out.println("========PHẦN MỀM QUẢN LÝ MƯỢN SÁCH THƯ VIỆN========");
    System.out.println("1. Thêm mới sách vào kho");
    System.out.println("2. Hiển thị danh sách các cuốn sách mà thư viện đang có");
    System.out.println("3. Đăng ký tài khoản cho bạn đọc mới");
    System.out.println("4. Hiển thị danh sách bạn đọc có trong thư viện");
    System.out.println("5. Lập bảng quản lý mượn sách");
    System.out.println("6. In danh sách lượt mượn sách ");
    System.out.println("7. Sắp xếp bảng quản lý mượn sách");
    System.out.println("8. Tìm kiếm và hiển thị danh sách mượn sách theo tên bạn đọc");
    System.out.println("9. Thoát");
  }

}
