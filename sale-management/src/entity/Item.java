package entity;

import constant.ItemType;
import java.util.Scanner;

public class Item {

  private static int AUTO_ID = 1000;

  private int id;
  private String name;
  private ItemType itemType;
  private int price;
  private int quantity;

  public Item() {
    this.id = AUTO_ID;
    AUTO_ID++;
  }


  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ItemType getItemType() {
    return itemType;
  }

  public void setItemType(ItemType itemType) {
    this.itemType = itemType;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "Item{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", itemType=" + itemType +
        ", price=" + price +
        ", quantity=" + quantity +
        '}';
  }

  public void inputInfo() {
    System.out.println("Nhap ten mat hang");
    this.setName(new Scanner(System.in).nextLine());
    System.out.println("Nhap gia");
    this.setPrice(new Scanner(System.in).nextInt());
    System.out.println("Nhap so luong");
    this.setQuantity(new Scanner(System.in).nextInt());
    System.out.println("Lua chon nhom hang");
    System.out.println("1. Điện tử");
    System.out.println("2. Điện lạnh");
    System.out.println("3. Máy tính");
    System.out.println("4. Thiết bị văn phòng");
    int type;
    while (true) {
      type = new Scanner(System.in).nextInt();
      if (type >= 1 && type <= 4) {
        break;
      }
      System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
    }
    switch (type) {
      case 1:
        this.setItemType(ItemType.DT);
        break;
      case 2:
        this.setItemType(ItemType.DL);
        break;
      case 3:
        this.setItemType(ItemType.MT);
        break;
      case 4:
        this.setItemType(ItemType.TBVP);
        break;
    }
  }
}
