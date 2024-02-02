package Loop;

public class ForEx6 {

  /* 반복문 : 특정 작업이 반복 적으로 수행 되도록 할 때 사용
   * for, while, do - while
   *
   *
   */

  public static void main(String[] args) {
    //  1 에서 100 까지 수중에 3 의 배수 만 더하기
    int num1 = 0;

    for (int i = 1; i < 101; i++) {
      if (i % 3 == 0) {
        num1 += i;
      }
    }
    System.out.println(
      "1 에서 100 까지 수중에 3 의 배수 만 더한 값은? : " + num1
    );

    for (int i = 1; i < 101; i += 3) {
      System.out.print(i + "\t");
    }
    System.out.println();
  }
}
