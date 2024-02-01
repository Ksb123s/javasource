package Loop;

public class ForEx4 {

  /* 반복문 : 특정 작업이 반복 적으로 수행 되도록 할 때 사용
   * for, while, do - while
   *
   *
   */

  public static void main(String[] args) {
    // 구구단 출력
    for (int i = 2; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        System.out.printf("%d * %d = %d\n", i, j, i * j);
      }
    }

    // 5행 10열의 별 (*)
    for (int i = 0; i < 5; i++) {
      System.out.print("\n");
      for (int j = 1; j < 11; j++) {
        System.out.print("*");
      }
    }
  }
}
