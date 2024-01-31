package exam;

import java.util.Scanner;

public class Salary {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /* 사다리 꼴의 넒이를 구한 후 출력 임의수
     *
     */

    System.out.println("월급 입력");
    int salary = sc.nextInt();
    int total = (salary * 12) * 10;

    System.out.printf("10 동안 저축 금액은 %d 입니다.", total);
    sc.close();
  }
}
