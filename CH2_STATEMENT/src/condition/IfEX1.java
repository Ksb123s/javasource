package condition;

/* 제어문
 *   1) 조건문
 *       조건에 따라 다음 문장 수행 여부 결정
 *          if , switch case
 *
 *   2) 반복문
 */
public class IfEX1 {

  public static void main(String[] args) {
    // if(조건식){조건식이 참일때 수행할 문장들}
    // {}: 수행 구문이 한줄일씨 수행가능
    int x = 0;

    if (x == 0) System.out.println("x == 0"); else if (x != 0) {
      System.out.println("x != 0");
    } else if (x == 0) {
      System.out.println("!(x == 0)");
    } else if (x != 0) {
      System.out.println("!(x != 0)");
    }
  }
}
