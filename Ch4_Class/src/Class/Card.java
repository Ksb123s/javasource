package Class;

public class Card {

  private String kind;
  private int numbers;

  // 클래스 변수
  static int width = 150;
  static int height = 180;

  public Card(String kind, int numbers) {
    this.kind = kind;
    this.numbers = numbers;
  }
}
