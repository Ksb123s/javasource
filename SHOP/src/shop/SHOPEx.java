package shop;

public class SHOPEx {

  public static void main(String[] args) {
    IShop shop = new MyShop();
    shop.setTitle("MyShop");
    shop.genUser();
    shop.genProduct();
    shop.Start();
  }
}
