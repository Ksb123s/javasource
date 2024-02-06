package Class;

public class TvEx {

  public static void main(String[] args) {
    Tv tv = new Tv("black", true, 3);

    // System.out.println(tv.color);
    // System.out.println(tv.chennel);
    // System.out.println(tv.onOff);

    // tv.color = "Black";
    // tv.chennel = 3;
    // tv.onOff = true; // true = on
    tv.ChannelUp();
    System.out.println(tv.getChennel());

    // //체널 번호 입력
    tv.setChennel(45);
    System.out.println(tv.getChennel());

    tv.setOnOff(false);
    System.out.println(tv.isOnOff());
  }
}
