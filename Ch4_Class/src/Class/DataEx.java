package Class;

public class DataEx {

  public static void main(String[] args) {
    Data data = new Data();
    data.x = 15;
    //change(data.x);
    change2(data);
    System.out.println("x 의 값" + data.x);
  }

  // 메소드르  호출할 때 메게변수로 지정한 값을 메소드의 매개변수에 복사
  // 매개변수의 타입 => 1) 기본형 2) 참조형
  // 기본형 매개변수 : 변수의 값을 읽기만 가능
  // 참조형 매개변수 : 변수의 값을 읽고 변경 가능
  static void change(int x) {
    x = 20;
  }

  static void change2(Data data) {
    data.x = 20;
  }
}
