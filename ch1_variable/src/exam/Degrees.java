package exam;

import java.util.Scanner;

public class Degrees {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /* 화씨온도를 입력받아 섭씨 온도 변환
           (x - 32 )*5/9 = 섭씨
         * 
         * 
         */

    System.out.println("화씨온도 입력");
    int Fdegrees = sc.nextInt();

    double Cdegrees = (Fdegrees - 32) * 5.0 / 9;
    System.out.printf("화씨온도는 %3.2f도 이다", Cdegrees);
    sc.close();
  }
}
