package logichandle;

import entity.SaleExecute;
import java.util.Scanner;

public class SaleExecuteLogicHandle {

  private final SaleExecute saleExecutes = new SaleExecute();

  public int getReadersLength() {
    return saleExecutes.length;
  }

  public void printIm() {
    for (int i = 0; i < saleExecutes.length; i++) {
      if (saleExecutes[i] == null) {
        continue;
      }
      System.out.println(saleExecutes[i]);
    }
  }

  public void inputNewReader() {
    System.out.print("Nhập danh sách nhân viên: ");
    int saleExecutesNumber = new Scanner(System.in).nextInt();
    for (int i = 0; i < saleExecutesNumber; i++) {
      System.out.println("Nhập thông tin cho nhân viên thứ " + (i + 1));
      SaleExecute saleExecute = new saleExecutes();
      saleExecutes.inputInfo();

      // lưu nhân viên
      SaleExecute(saleExecutes);
    }

  }

  public void SaleExecute(saleExecutes reader) {

    for (int j = 0; j < saleExecutes.length; j++) {
      if (saleExecutes[j] != null) {
        continue;
      }
      saleExecutes[j] = saleExecutes;
      break;
    }
  }

  public boolean checkCoNhanVienBanHangHayChua() {
    boolean checkCoNhanVienBanHangHayChua = false;
    for (int i = 0; i < saleExecutes.length; i++) {
      if (saleExecutes[i] != null) {
        checkCoNhanVienBanHangHayChua = true;
        break;
      }
    }
    return checkCoNhanVienBanHangHayChua;
  }

}
