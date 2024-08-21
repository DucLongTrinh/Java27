package entity;

import demointerface.Movable;

public class Student extends Person implements Movable {

  @Override
  public void nghiNgoi() {
      // code: sinh viên nghỉ ngơi như nào
  }

  @Override
  public void anUong() {
    // code: ăn uống như thế nào
  }

  @Override
  public void move() {
    // code: Di chuyển như thế nào
  }

}
