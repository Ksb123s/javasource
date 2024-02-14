package exam2;

import java.util.Scanner;

public class CalcEx {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input num1 :");
    int num1 = Integer.parseInt(scanner.nextLine());
    System.out.println("Input num2 :");
    int num2 = Integer.parseInt(scanner.nextLine());
    System.out.println("Input Operator :");
    String op = scanner.nextLine();

    Calc calc = null;
    switch (op) {
      case "*":
        calc = new Mul();
        break;
      case "/":
        calc = new Div();
        break;
      case "-":
        calc = new Sub();
        break;
      case "+":
        calc = new Add();
        break;
      default:
        break;
    }

    calc.setValue(num1, num2);
    System.out.println(calc.calculate());
  }
}
