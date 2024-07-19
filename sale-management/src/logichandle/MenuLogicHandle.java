package logichandle;

import java.util.Scanner;

public class MenuLogicHandle {


  public void menu() {
    while (true) {
      printMenuOptions();
      int functionChoice = chooseFunction();
      switch (functionChoice) {
        case 1:
          ItemLogicHanndel.inputNewItem();
          break;
        case 2:
          ItemLogicHanndel.printItems();
          break;
//        case 3:
//          SaleExecuteLogicHandle.inputSaleExecute();
//          break;
//        case 4:
//          SaleExecuteLogicHandle.printSaleExecutes();
//          break;
//        case 5:
//          ItemSaleOrderLogicHandle.createItemSaleOrder();
//          break;
//        case 6:
//          ItemSaleOrderLogicHandle.printItemSaleOrder();
//          break;
//        case 7:
//          ItemSaleOrderLogicHandle.sort();
//          break;
//        case 8:
//          ItemSaleOrderLogicHandle.createItemSaleOrder();
//          break;
        case 9:
          return;
      }
    }
  }


  private int chooseFunction() {
    System.out.print("Xin mời chọn chức năng: ");
    int functionChoice;
    while (true) {
      functionChoice = new Scanner(System.in).nextInt();
      if (functionChoice >= 1 && functionChoice <= 9) {
        break;
      }
      System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
    }
    return functionChoice;
  }

  private void printMenuOptions() {
    System.out.println("===============PHẦN MỀM QUẢN LÝ BÁN HÀNG===========");
    System.out.println("1. Nhập danh sách mặt hàng mới vào kho");
    System.out.println("2. Hiển thị danh sách các mặt hàng đã có trong kho");
    System.out.println("3. Nhập danh sách nhân viên");
    System.out.println("4. Hiển thị danh sách nhân viên");
    System.out.println("5. Lập bảng quản lý bán hàng");
    System.out.println("6. In danh sách lượt bán hàng");
    System.out.println("7. Sắp xếp bảng quản lý bán hàng ");
    System.out.println("8. Lập bảng kê doanh thu ");
    System.out.println("9. Thoát ");

  }

}
