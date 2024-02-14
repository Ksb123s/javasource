package shop;

public abstract class Product {

  private int price;
  private String ModelName;

  public Product(int price, String modelName) {
    this.price = price;
    this.ModelName = modelName;
  }

  public void PrintDetail() {
    System.out.println("가격은 : " + this.price);
    System.out.println("모델명은 : " + this.ModelName);
    PrintExtra();
  }

  public abstract void PrintExtra();

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getModelName() {
    return ModelName;
  }

  public void setModelName(String modelName) {
    ModelName = modelName;
  }
}
