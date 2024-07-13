package demorectangle;

public class Rectangle {
  private float chieuDai;
  private float chieuRong;

  public Rectangle (float chieuDai, float chieuRong) {
    this.chieuDai = chieuDai;
    this.chieuRong = chieuRong;

  }

  public float getChieuDai() {
    return chieuDai;
  }

  public float getChieuRong() {
    return chieuRong;
  }

  public float setChieuDai() {
    return chieuDai;
  }

  public float setChieuRong() {
    return chieuRong;
  }

  public double tinhChuVi() {
    return (chieuRong + chieuDai) * 2;
  }

  public double tinhDienTich() {
    return chieuRong * chieuRong;
  }
}
