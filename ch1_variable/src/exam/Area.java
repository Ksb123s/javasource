package exam;

import java.util.Scanner;

public class Area {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /* 사다리 꼴의 넒이를 구한 후 출력 임의수
     *
     */

    System.out.println("높이 입력");
    int hight = sc.nextInt();
    System.out.println(" 윗변의 길이 입력");
    int width = sc.nextInt();
    System.out.println(" 아랫변의 길이 입력");
    int width2 = sc.nextInt();

    double result1 = (double) ((width + width2) * hight) / 2;

    System.out.printf("사다리 꼴의 넓이는 %5.2f 이다. ", result1);
    sc.close();
  }
}
