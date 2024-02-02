package Loop;

import java.util.Scanner;

public class DoWhileEx1 {

  public static void main(String[] args) {
    // 조건이 맞지 않을때 do-while 은 한번은 무조건 실행
    int input = 0, answer = 0;
    answer = (int) (Math.random() * 100 + 1);
    Scanner sc = new Scanner(System.in);

    do {
      System.out.println(" 1~ 100 사이 정수 입력");
      input = sc.nextInt();

      if (answer < input) {
        System.out.println("더작은 수를 입력해 주세요");
      } else {
        System.out.println("더큰 수를 입력해 주세요");
      }
    } while (input != answer);
    System.out.println("정답입니다!!! 프로그램을 종료합니다.");
  }
}
