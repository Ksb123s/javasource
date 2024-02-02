package Loop;

public class ForEx7 {

  /* 반복문 : 특정 작업이 반복 적으로 수행 되도록 할 때 사용
   * for, while, do - while
   *
   *
   */

  public static void main(String[] args) {
    //  1 에서 100 까지 수중에 3 의 배수 만 더하기(단 9 의 배수는 제왜)
    int num1 = 0;

    for (int i = 1; i < 101; i++) {
      if ((i % 3 == 0) && (i % 9 != 0)) {
        num1 += i;
      }
    }
    System.out.println(
      "1 에서 100 까지 수중에 3 의 배수 와 9의 배수가 아닌것 만 더한 값은? : " +
      num1
    );

    //  1 에서 100 까지  3과 5 배수의합

    int num2 = 0;

    for (int i = 1; i < 101; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        num2 += i;
      }
    }
    System.out.println("1 에서 100 까지 수중에 3 과 5의 배수의 합? : " + num2);
  }
}
