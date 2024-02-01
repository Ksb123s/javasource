package exam;

import java.util.Scanner;

public class LeapYear {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //년도를 입력 받은 후 윤년 , 평년인지 출력
    //  윤년 : 해당 년도를 4로 나눈 나머지 0 이고 , 100으로 나눈 나머지가 0이 아니거 나 400으로 나눈 나머지가 0이면
    //  평년 : 그외

    System.out.println("년도를 입력해 주세요");
    int years = sc.nextInt();
    boolean result =
      ((years % 4) == 0) && ((years % 100 != 0) || (years % 400 == 0));
    if (result == true) {
      System.out.println(" 해당 년도는 윤년 입니다.");
    } else {
      System.out.println(" 해당 년도는 평년 입니다.");
    }
  }
}
