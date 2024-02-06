package Exam;

public class Calc {

  int num1, num2, result;

  Calc() {}

  int Sum(int num1, int num2) {
    result = num1 + num2;
    return result;
  }

  int Dev(int num1, int num2) {
    result = num1 / num2;
    return result;
  }

  int sSubtract(int num1, int num2) {
    result = num1 - num2;
    return result;
  }

  int Multiply(int num1, int num2) {
    result = num1 * num2;
    return result;
  }
}
