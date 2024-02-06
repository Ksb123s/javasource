package Exam;

public class GoodStockEx1 {

  public static void main(String[] args) {
    GoodStock goodStock = new GoodStock("Book", 20);

    System.out.println("재고 수량은 :" + goodStock.addStock(10));

    System.out.println("재고 수량은 :" + goodStock.SubtractStock(20));
    System.out.println("재고 수량은 :" + goodStock.SubtractStock(20));
  }
}
