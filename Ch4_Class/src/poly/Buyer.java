package poly;

public class Buyer {

  int money = 1000; // 소유금액
  int bonusePoint = 0;

  void buy(Product p) {
    if (money < p.price) {
      System.err.println("잔액이 부족합니다.");
      return;
    }

    money -= p.price;
    bonusePoint += p.bonusePoint;
    System.out.println(" 제품을 구매하셨습니다.");
  }
}
