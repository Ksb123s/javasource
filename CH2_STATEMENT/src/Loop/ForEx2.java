package Loop;

public class ForEx2 {

  /* 반복문 : 특정 작업이 반복 적으로 수행 되도록 할 때 사용
   * for, while, do - while
   *
   *
   */

  public static void main(String[] args) {
    /*
      1 에서 5출력 
    */
    /* 
    for (int i = 1; i < 6; i++) {
      System.out.println(i);
    }
    */
    // 1 ~ 10 합게 구하기
    int sum = 0;
    for (int i = 1; i < 11; i++) {
      sum += i;
    }
    System.out.println(sum);

    for (int i = 1, j = 10; i < 11; i++, j--) {
      System.out.printf("%d \t %d\n", i, j);
    }
  }
}
