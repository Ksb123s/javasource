package Operator;

import java.util.Scanner;

public class ConditionEx2 {

  //조건연산자 : 조건식 ? 식1 : 식2;
  public static void main(String[] args) {
    // 숫자 입력 받을 후 그 숫자가 양수인지 음수인지 판별

    Scanner sc = new Scanner(System.in);
    System.out.println("숫자를 입력해 주세요");
    int num = sc.nextInt();

    System.out.println((num > 0) ? "양수" : (num == 0) ? "0입니다." : "음수");

    // 짝 수 비교45

    System.out.println("숫자를 입력해 주세요");
    int num2 = sc.nextInt();
    System.out.println(((num2 % 2) == 0) ? "짝수" : "홀수");

    // ch1 이 영문자이거나 1~ 9 사이에 숫자인지 판별

    char ch1 = 'a';
    boolean result =
      (ch1 >= 'a' && ch1 <= 'b') ||
      (ch1 > 'A' && ch1 <= 'B') ||
      (ch1 > 0 && ch1 <= 9);
    System.out.println(result);
  }
}
