package exam;

import java.util.Scanner;

public class Calc {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("+, - ,*, /, % 중에 입력해 주세요");
    String op = sc.nextLine();
    //System.out.println(" 입력한 문자는" + op);

    //System.out.println(num1);
    //  계산 프로그램
    System.out.println("첫번째 숫자를 입력해 주세요");
    double num1 = (double) sc.nextFloat();

    System.out.println("두번째 숫자를 입력해 주세요");
    double num2 = (double) sc.nextFloat();
    double result = 0;
    switch (op) {
      case "+":
        result = num1 + num2;
        break;
      case "-":
        result = num1 - num2;
        break;
      case "*":
        result = num1 * num2;
        break;
      case "/":
        result = num1 / num2;
        break;
      case "%":
        result = num1 % num2;
        break;
      default:
        System.out.println("잘못 입력하셨습니다.");
    }
    System.out.printf("계산한 결과는 %5.2f입니다. \n", result);
  }
}
