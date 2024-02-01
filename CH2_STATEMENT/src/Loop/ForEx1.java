package Loop;

public class ForEx1 {

  /* 반복문 : 특정 작업이 반복 적으로 수행 되도록 할 때 사용
   * for, while, do - while
   *
   *
   */

  public static void main(String[] args) {
    /* 
        for(int i = 0; : 초기화 i < args.length; :조건식  i++ :증감식){

        }
        */
    for (int i = 0; i < 5; ++i) {
      System.out.println(" I Can Do It");
    }

    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
  }
}
