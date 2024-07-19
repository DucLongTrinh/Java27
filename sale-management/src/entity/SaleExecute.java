package entity;

import java.time.LocalDate;

public class SaleExecute extends Person {

  private static int AUTO_ID = 1000;

  private int id;
  private LocalDate date;

  public SaleExecute() {
    this.id  = AUTO_ID;
    AUTO_ID ++;
  }


  public int getId() {
    return id;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "SaleExecute{" +
        "id=" + id +
        ", date=" + date +
        ", name='" + name + '\'' +
        ", address='" + address + '\'' +
        ", phone='" + phone + '\'' +
        '}';
  }
}
