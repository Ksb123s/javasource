package inheritance;

public class DmbCellPhone extends Cellphone {

  int channel;

  void trunOnDmb() {
    System.out.println("채널" + channel + "번 DMB 방송 시작.");
  }

  void changChannelDmb(int channel) {
    this.channel = channel;
    System.out.println("채널" + channel + "번으로 변경");
  }

  void trunOffDmb() {
    System.out.println("채널" + channel + "번 DMB 방송 종료.");
  }
}
