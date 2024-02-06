package Class;

public class Time {

  // 시,분,초는 모두 0 보다 크거나 같아야 한다
  // 시의 범위는 0~23, 분,초의 범위는 0~59이다.
  private int hour;
  private int minute;
  private float second;

  private static String max;

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) {
    if (hour >= 24 || hour < 0) {
      System.err.println("오류");
      return;
    } else {
      this.hour = hour;
    }
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    if (minute >= 61 || minute < 0) {
      System.err.println("오류");
      return;
    } else {
      this.minute = minute;
    }
  }

  public float getSecond() {
    return second;
  }

  public void setSecond(float second) {
    if (second >= 61 || second < 0) {
      System.err.println("오류");
      return;
    } else {
      this.second = second;
    }
    // 오버로딩 : 하나의 클래스에 동일한 이름으로 존재
    // ()안에 인자의 갸수, 타입 등이 달라야함

    // 생성자 오버로딩
    // 메소드 오버로딩
  }
}
