package condition;

import java.util.Scanner;

public class IfEX7 {

  // math.random() 0 보다 크고 1.0 보다 작수  가 출력
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("월을 입력 하세요");
    int month = sc.nextInt();
    String season = " ";
    // 월을 입력 받아 계절을 출력
    // 345 현제 계절은 봄입니다.
    if (month == 12 || month == 1 || month == 2) {
      season = "현제 계절은 겨울 입니다.";
    } else if (month == 3 || month == 4 || month == 5) {
      season = "현제 계절은 봄 입니다.";
    } else if (month == 6 || month == 7 || month == 8) {
      season = "현제 계절은 여름 입니다.";
    } else if (month == 9 || month == 10 || month == 11) {
      season = "현제 계절은 가을 입니다.";
    } else {
      season = " 입력 월을 확인해 주세요";
    }

    System.out.println(season);
  }
}
