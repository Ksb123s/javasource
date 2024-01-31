package exam;

import java.util.Scanner;

public class Result300 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int value = 356;
    /* 
    while (true) {
      value = --value;

      if (value == 300) {
        break;
      }
    }
    System.out.println(value);
    */
    int total = (value / 300) * 300;
    System.out.println(total);

    int num = 24;
    /* 변수 num 의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺸
     * 나머지를 구하시오
     *
     */
    /* 
    int Result3 = num;
    while (true) {
      ++num;
      if ((num % 10) == 0) {
        Result3 = num - Result3;
        break;
      }
    }
    System.out.println(Result3);
    */
    int result = (10 - num % 10);
    System.out.println(result);

    int num2 = 333;
    /* num2의 값 중에서 일의 자리를 1로 바꾸는 프로그램 작성
     * ex num2 = 333 -> 331
     */

    int result2 = num2 - ((num2 % 10) - 1);
    System.out.println(result2);
    sc.close();
  }
}
