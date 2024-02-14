package shop;

public class CellPhone extends Product {

  private String Carrier;

  public CellPhone(int price, String modelName, String Carrier) {
    super(price, modelName);
    this.Carrier = Carrier;
  }

  @Override
  public void PrintExtra() {
    System.out.println("통신사 : " + Carrier);
  }
}
