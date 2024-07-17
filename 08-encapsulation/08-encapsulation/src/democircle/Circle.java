package democircle;

public class Circle {

  private float radius;



  public Circle(float radius) {
    this.radius = radius;

  }

  public float getRadius() {
    return radius;
  }

  public void setRadius(float radius) {
    this.radius = radius;
  }

  public double tinhChuVi() {
    return Math.PI * radius * 2;
  }

  public double tinhDienTich() {
    return Math.PI * radius * radius;
  }

}
