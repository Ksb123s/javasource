package Exam;

public class CalcEx1 {

  public static void main(String[] args) {
    Calc calc = new Calc();

    int result = calc.Sum(15, 20);
    System.out.println("덧셈 결과 = " + result);

    System.out.println("곱셈 결과 : " + calc.Multiply(15, 45));
    double result2 = calc.Dev(123, 45);

    System.out.println("나눗셈 결과 :" + result2);
  }
}
