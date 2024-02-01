package condition;

import java.util.Scanner;

public class IfEX6 {

  // math.random() 0 보다 크고 1.0 보다 작수  가 출력
  public static void main(String[] args) {
    int dice = (int) (Math.random() * 6) + 1;

    if (dice == 6) {
      System.out.println("주사위 값: " + dice);
    } else if (dice == 5) {
      System.out.println("주사위 값: " + dice);
    } else if (dice == 4) {
      System.out.println("주사위 값: " + dice);
    } else if (dice == 3) {
      System.out.println("주사위 값: " + dice);
    } else if (dice == 2) {
      System.out.println("주사위 값: " + dice);
    } else {
      System.out.println("주사위 값: " + dice);
    }
  }
}
