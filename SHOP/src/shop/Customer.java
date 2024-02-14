package shop;

public class Customer {

  private String name;
  private PayType PayType;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PayType getPayType() {
    return PayType;
  }

  public void setPayType(PayType payType) {
    PayType = payType;
  }
}
