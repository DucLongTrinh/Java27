package entity;

import java.util.Arrays;

public class ItemSaleOrder {

  private SaleExecute saleexecute;
  private ItemSaleOrderDetail[] details;
  private int tongSoItem;

  public ItemSaleOrder(SaleExecute saleexecute, ItemSaleOrderDetail details) {
    this.saleexecute = saleexecute;
    this.details = details;
  }

  public ItemSaleOrder(SaleExecute saleexecute, ItemSaleOrderDetail[] details, int tongSoItem) {
    this.saleexecute = saleexecute;
    this.details = details;
    this.tongSoItem = tongSoItem;
  }

  public SaleExecute getSaleexecute() {
    return saleexecute;
  }

  public void setSaleexecute(SaleExecute saleexecute) {
    this.saleexecute = saleexecute;
  }

  public ItemSaleOrderDetail[] getDetails() {
    return details;
  }

  public void setDetails(ItemSaleOrderDetail[] details) {
    this.details = details;
  }

  public int getTongSoItem() {
    return tongSoItem;
  }

  public void setTongSoItem(int tongSoItem) {
    this.tongSoItem = tongSoItem;
  }

  public int getTotalQuantity() {
    int total = 0;
    for (ItemSaleOrderDetail detail : details) {
      total += detail.getQuantity();
    }
    return total;
  }

  @Override
  public String toString() {
    return "entity.ItemSaleOrder{" +
        "saleexecute=" + saleexecute +
        ", details=" + Arrays.toString(details) +
        ", tongSoItem=" + tongSoItem +
        '}';
  }
}
