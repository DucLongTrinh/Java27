public class Car {

  String id;
  String model;
  String brand;
  String color;
  float engineSpeed;
  int weelNumner;


  public void move() {

  }

  public void tanEm() {

  }

  @Override
  public String toString() {
    return "Car{" +
        "id='" + id + '\'' +
        ", model='" + model + '\'' +
        ", brand='" + brand + '\'' +
        ", color='" + color + '\'' +
        ", engineSpeed=" + engineSpeed +
        ", weelNumner=" + weelNumner +
        '}';
  }
}
