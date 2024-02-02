package exam;

public class PrimeNumber {

  public static void main(String[] args) {
    // 1~100 의 숫자중에 소수찾아서출력

    int count = 0;

    for (int i = 2; i < 101; i++) {
      for (int j = 2; j <= i; j++) {
        if (j == i) {
          count += 1;
          System.out.printf("%d, ", i);
          break;
        } else if (i % j == 0) {
          break;
        }
      }
    }
    System.out.println(" 소수의 갯수는 : " + count);
  }
}
