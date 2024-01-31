package Operator;

// 산술 연산자 : +, -, *, /, %(나머지)
public class ArithmeticEx2 {

  public static void main(String[] args) {
    /* int apple = 1;
      double pieceUnit = 0.1d;
      int number = 7;
      double result = apple - number * pieceUnit;
    
      System.out.println(result);*/

    int apple = 1;
    int totalPriece = apple * 10;
    int number = 7;
    int temp = totalPriece - number;
    double result = temp / 10.0;

    System.out.println(result);
    // Exception in thread "main" java.lang.ArithmeticException: / by zero
    System.out.println(10 / 0);
  }
}
