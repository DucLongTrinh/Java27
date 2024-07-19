package logichandle;

import entity.Item;
import java.util.Scanner;

public class ItemLogicHanndel {


  private final Item[] items = new Item[1000];

  public int getItemsLength() {
    return items.length;
  }

  public static void printItems() {

//    for (int i = 0; i < items.length; i++) {
//      if (items[i] == null) {
//        continue;
//      }
//      System.out.println(items[i]);
//    }
  }

  public static void inputNewItem() {
    System.out.print("Nhập số lượng mặt hàng muốn thêm moi: ");
    int itemNumber = new Scanner(System.in).nextInt();
    for (int i = 0; i < itemNumber; i++) {
      // nhập thông tin
      System.out.println("Nhập thông tin cho  thứ " + (i + 1));

      // nhập thông tin
      Item item = new Item();
      item.inputInfo();

      // lưu vào mảng
      saveItem(item);
    }
  }

  private void saveItem(Item item) {
    for (int j = 0; j < items.length; j++) {
      if (items[j] == null) {
        items[j] = item;
        break;
      }
    }
  }
}
