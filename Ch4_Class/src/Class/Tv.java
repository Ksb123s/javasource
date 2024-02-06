package Class;

// 멤버변수 초기값
// String : null
// int, long : 0
// float, double : 0.0
// char : ''
// boolean :false

public class Tv {

  // 색상(검,흰) ,전원상태(on,off) ,채널(5,6,8,78), 볼륨(13,14), 인치(45,55,75)
  private String color;
  private boolean onOff;
  private int chennel;

  void ChannelUp() {
    chennel++;
  }

  void ChannelDown() {
    chennel--;
  }

  void ChannelNumber(int number) {
    chennel = number;
  }

  public Tv() {}

  // 생성자 오버로딩
  public Tv(String color, boolean onOff, int chennel) {
    this.color = color;
    this.onOff = onOff;
    this.chennel = chennel;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isOnOff() {
    return onOff;
  }

  public void setOnOff(boolean onOff) {
    this.onOff = onOff;
  }

  public int getChennel() {
    return chennel;
  }

  public void setChennel(int chennel) {
    this.chennel = chennel;
  }
}
