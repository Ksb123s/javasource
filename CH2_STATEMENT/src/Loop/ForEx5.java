package Loop;

public class ForEx5 {

  /* 반복문 : 특정 작업이 반복 적으로 수행 되도록 할 때 사용
   * for, while, do - while
   *
   *
   */

  public static void main(String[] args) {
    // 구구단 출력

    // *
    // **
    // ***
    // ****
    // *****

    for (int i = 1; i < 6; i++) {
      System.out.print("\n");
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
    }
    System.out.println("");
    for (int i = 0; i < 5; i++) {
      for (int k = 5; k > i; k--) {
        System.out.print(' ');
      }
      for (int j = 0; j < 2 * i + 1; j++) {
        System.out.print('*');
      }
      System.out.println("");
    }
  }
}
