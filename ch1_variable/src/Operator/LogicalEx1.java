package Operator;

public class LogicalEx1 {

  // && : 피연산자 양쪽 모두 TRUE 여야 TRUE 값을 얻음
  // || : 피연산자 둘중 하나만이라도 TRUE 면 TRUE 값을 얻음
  public static void main(String[] args) {
    // X는 10 보다 크고 , 20보다 작다
    int x = 15;

    System.err.println(x > 10 && x < 20);

    int CharCode = 'A';

    if ((CharCode >= 65) && (CharCode <= 90)) {
      System.out.println("대문자");
    } else System.err.println("소문자");

    char CharCode2 = 'a';
    System.out.println(CharCode2 >= 'a' && CharCode2 <= 'z');
    if ((CharCode2 >= 'a') && (CharCode2 <= 'z')) {
      System.out.println("소문자");
    } else System.err.println("대문자");

    // i 는 2의 배수 또는 3의 배수이다
    int num1 = 48;
    if ((num1 % 2) == 0 || (num1 % 3) == 0) {
      System.out.println("num1 2 또는 3 의 배수이다");
    }

    // i 는 2의 배수 또는 3의 배수이지만 6의 배수는 아니다
    if ((((num1 % 2) == 0) || ((num1 % 3) == 0)) && (num1 % 6) != 0) {
      System.out.println("num1 2 또는 3 의 배수이며 6의 배수가 아니다");
    }
  }
}
