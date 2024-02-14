package poly;

public class Product {

  int price;

  int bonusePoint;

  public Product(int price) {
    this.price = price;
    this.bonusePoint = (int) (price / 10.0);
  }
}
