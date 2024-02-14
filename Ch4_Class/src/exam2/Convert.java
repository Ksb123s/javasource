package exam2;

import java.util.Scanner;

public abstract class Convert {

  protected abstract double convert(double src);

  protected abstract String getSrcString();

  protected abstract String getDestString();

  protected double ratio = 1200;

  public void run() {
    Scanner scanner = new Scanner(System.in);
    System.out.println(
      getSrcString() + "을 " + getDestString() + "로 바꿉니다."
    );
    System.out.println(getSrcString() + "을 입력하세요 >>");
    double val = scanner.nextDouble();
    double res = convert(val);
    System.out.println("변환결과 : " + res + getDestString() + "입니다.");
    scanner.close();
  }
}
