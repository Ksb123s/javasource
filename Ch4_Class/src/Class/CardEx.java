package Class;

public class CardEx {

  public static void main(String[] args) {
    Card card1 = new Card("heart", 2);
    Card card2 = new Card("spade", 5);

    System.out.println("카드크기" + card1.height);
    System.out.println("카드크기" + card1.width);

    System.out.println("카드크기" + card2.height);
    System.out.println("카드크기" + card2.width);

    CardEx cardEx = new CardEx();
    cardEx.method1();
  }

  public void method1() {
    System.out.println("인스턴스 메소드");
  }
}
