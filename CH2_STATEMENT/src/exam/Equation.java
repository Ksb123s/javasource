package exam;

public class Equation {

  public static void main(String[] args) {
    // 4x + 5 y = 60 이 나오는 모든 해 구하기
    //  x, y는 10이하 자연수

    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 10; j++) {
        if ((4 * i) + (5 * j) == 60) {
          System.out.printf("4x + 5y =60 의 해는: X = %d , Y =%d \n", i, j);
        }
      }
    }
  }
}
