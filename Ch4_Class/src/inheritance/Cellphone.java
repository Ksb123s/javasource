package inheritance;

public class Cellphone {

  String color;
  String model;

  void PowerOn() {
    System.out.println("전원을 킵니다.");
  }

  void PowerOff() {
    System.out.println("전원을 끕니다.");
  }

  void bell() {
    System.out.println("벨이 울립니다.");
  }

  void sendVoice(String msg) {
    System.out.println("본인 :" + msg);
  }

  void receiveVoice(String msg) {
    System.out.println("상대방 :" + msg);
  }

  void HangUp() {
    System.out.println("전화를 끊습니다.");
  }
}
