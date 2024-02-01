package exam;

import java.util.Scanner;

public class MaxValue {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //년도를 입력 받은 후 윤년 , 평년인지 출력
    //  윤년 : 해당 년도를 4로 나눈 나머지 0 이고 , 100으로 나눈 나머지가 0이 아니거 나 400으로 나눈 나머지가 0이면
    //  평년 : 그외

    System.out.println("첫번째 숫자");
    int num1 = sc.nextInt();

    System.out.println("두번째 숫자");
    int num2 = sc.nextInt();

    System.out.println("세번째 숫자");
    int num3 = sc.nextInt();

    int maxvalue = Math.max(Math.max(num1, num2), num3);
    System.out.println(" 가장 큰수는 : " + maxvalue);
    /* 
    if (num2 > num1) {
      if (num3 > num2) {
        System.out.println("최댓값은 : " + num3);
      } else if (num2 == num3) {
        System.out.println("최댓값은 : " + num2 + "과 " + num3 + "이다.");
      } else {
        System.out.println("최댓값은 : " + num2);
      }
    } else if (num1 > num2) {
      if (num3 > num1) {
        System.out.println("최댓값은 : " + num3);
      } else if (num1 == num3) {
        System.out.println("최댓값은 : " + num1 + "과 " + num3 + "이다.");
      } else {
        System.out.println("최댓값은 : " + num1);
      }
    } else {
      System.out.println("모두가 같은 수이다.");
    }
    */
    int max = num1;
    int min = num1;
    if (max < num2) {
      max = num2;
    }

    if (max < num3) {
      max = num3;
    }
    System.out.println(" 가장 큰수 : " + max);

    if (min > num2) {
      min = num2;
    }
    if (min > num3) {
      min = num3;
    }
    System.out.println(" 가장 작은수 : " + min);
  }
}
