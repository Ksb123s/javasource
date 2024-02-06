package Exam;

public class GoodStock {

  String goodsCode;
  int stockNum;

  public GoodStock() {}

  public GoodStock(String goodsCode, int stockNum) {
    this.goodsCode = goodsCode;
    this.stockNum = stockNum;
  }

  int addStock(int amount) {
    this.stockNum += amount;
    return this.stockNum;
  }

  int SubtractStock(int amount) {
    if (this.stockNum < amount) {
      System.out.println("재고가 부족합니다.");
      return this.stockNum;
    } else {
      this.stockNum -= amount;
      return this.stockNum;
    }
  }
}
