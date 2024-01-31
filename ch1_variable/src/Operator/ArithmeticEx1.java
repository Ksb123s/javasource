package Operator;

// 산술 연산자 : +, -, *, /, %(나머지)
public class ArithmeticEx1 {

  public static void main(String[] args) {
    int num1 = 5, num2 = 2;
    //정수간의 산술연산+
    int result1 = num1 + num2;
    System.out.printf("%d + %d = %d\n", num1, num2, result1);
    //-
    result1 = num1 - num2;
    System.out.printf("%d - %d = %d\n", num1, num2, result1);
    // *
    result1 = num1 * num2;
    System.out.printf("%d * %d = %d\n", num1, num2, result1);
    // /
    result1 = num1 / num2;
    System.out.printf("%d / %d = %d\n", num1, num2, result1);
    // %
    result1 = num1 % num2;
    System.out.printf("%d %% %d = %d\n", num1, num2, result1);

    double d1 = 6.0d;
    int d2 = 4;
    // 실수 연산 /
    double result2 = d1 / d2;
    System.out.printf("%.2f / %d = %.2f\n", d1, d2, result2);
    // %
    result2 = d1 % d2;
    System.out.printf("%.2f %% %d = %.2f\n", d1, d2, result2);

    // 문자열
    char ch1 = 'A' + 1;
    //char ch2 = (char) (ch1 + 1);
    System.out.printf("ch1 = %c", ch1);
  }
}
