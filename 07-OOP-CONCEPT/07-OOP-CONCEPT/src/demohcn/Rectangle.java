package demohcn;

public class Rectangle {

    float width;
    float height;

  public Rectangle() {
  }

  public Rectangle(float width, float height) {
    this.width = width;
    this.height = height;
    this.tinhDienTich();
  }

  public float tinhChuVi() {
      return 2* (width + height);
    }

    public float tinhDienTich (){
      return width * height;
    }

}
