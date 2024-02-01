package condition;

import java.util.Scanner;

public class IfEX3 {

  public static void main(String[] args) {
    // 점수가 90 이상이면 a , f
    Scanner sc = new Scanner(System.in);
    System.out.println("점수를 입력해 주세요");
    int score = sc.nextInt();
    if ((score % 2) == 0) {
      System.out.println("짝수");
    } else if ((score % 2) != 0) {
      System.out.println("홀수");
    }
  }
}
