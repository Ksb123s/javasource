package EnumTest;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ENUMEX {

  public static void main(String[] args) {
    Week today = null;

    // 오늘날짜 가저오기
    LocalDate now = LocalDate.now();
    System.out.println(now);

    // 오늘 날짜에 맞는 숫자 리턴 (1(월)~7(일))
    DayOfWeek week = now.getDayOfWeek();

    switch (week.getValue()) {
      case 1:
        today = Week.MONDAY;
        break;
      case 2:
        today = Week.THUSDAY;
        break;
      case 3:
        today = Week.WEDNESDAY;
        break;
      case 4:
        today = Week.THURSDAY;
        break;
      case 5:
        today = Week.FRIDAY;
        break;
      case 6:
        today = Week.SATUREDAY;
        break;
      case 7:
        today = Week.SUNDAY;
        break;
      default:
        break;
    }

    System.out.println("오늘 요일 : " + today);
    if (today == Week.SUNDAY) {
      System.out.println("휴식을 취합니다.");
    } else {
      System.out.println(" 자바 공부를 열심히 합니다.");
    }
  }
}
