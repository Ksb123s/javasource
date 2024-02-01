package exam;

import java.util.Scanner;

public class PlayOfHours {

  // 근무 시간 입력 받은 후
  // 시간 당 9800
  // 8시간 초과 근무 시간은 월래 받는 금액에 1.5 % 추가
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("근무 시간을 입력해 주세요");
    int time = sc.nextInt();
    int HourPay = 9800;
    if (time > 8) {
      HourPay = (HourPay * 8) + (int) (HourPay * (time - 8) * 1.5);
    } else {
      HourPay *= time;
    }
    System.out.printf("금일 일당은 %d 원 입니다.\n", HourPay);
  }
}
