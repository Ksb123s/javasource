package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx17 {

  // 2차원
  public static void main(String[] args) {
    // 가변 배열

    String[][] words = {
      { "chair", "" },
      { "computer", "컴퓨터" },
      { "integer", "정수" },
    };

    // 문자열 비교
    // equals()

    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < words.length; i++) {
      System.out.printf("Q%d) %s 의 뜻은?\n", (i + 1), words[i][0]);
      String answer = sc.nextLine();
      if (words[i][1].equals(answer)) {
        System.out.println("정답입니다.");
      } else {
        System.out.println(words[i][1].equals(answer));
        System.out.printf("오답입니다. 정답은 %s 입니다.\n", words[i][1]);
      }
    }
  }
}
