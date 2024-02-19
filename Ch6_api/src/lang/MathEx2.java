package lang;

import static java.lang.Math.*;

//  Math.class 모두 전부 static 상태
//
public class MathEx2 {

  public static void main(String[] args) {
    System.out.println(PI);
    //  0~ 1미만의 임의의 숫자
    System.out.println(random());

    // ceil() : 올림
    // floor() : 버림
    // round() : 반올림 return - long
    // rint() : 반올림 return - double
    double val = 90.7552;
    System.out.println("round() " + round(val));
  }
}
