package shop;

public class SmartTV extends Product {

  private String Resolution;

  public SmartTV(int price, String modelName, String Resolution) {
    super(price, modelName);
    this.Resolution = Resolution;
  }

  @Override
  public void PrintExtra() {
    System.out.println("화소 : " + Resolution);
  }
}
