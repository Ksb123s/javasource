package exam;

import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    // 숫자 입력 받은후 입력 받은 숫자의 n! 계산

    Scanner sc = new Scanner(System.in);

    System.out.println("숫자를 입력 해 주세요");
    int Num1 = sc.nextInt(), Fac1 = 1;
    for (int i = 1; i < Num1 + 1; i++) {
      Fac1 *= i;
    }

    System.out.printf("%d! = %d", Num1, Fac1);
  }
}
