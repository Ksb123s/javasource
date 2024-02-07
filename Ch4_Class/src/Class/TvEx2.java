package Class;

public class TvEx2 {

  public static void main(String[] args) {
    //tvㅣㄴ스턴스 3개 생성

    // Tv tv1 = new Tv("black", false, 3);
    // Tv tv2 = new Tv("white", false, 5);
    // Tv tv3 = new Tv("gray", false, 4);

    Tv tvarr[] = new Tv[3];
    tvarr[0] = new Tv("black", false, 3);
    tvarr[1] = new Tv("white", false, 5);
    tvarr[2] = new Tv("gray", false, 4);

    int arr[] = { 12, 13, 45 };

    Tv tvarr2[] = {
      new Tv("black", false, 3),
      new Tv("white", false, 5),
      new Tv("gray", false, 4),
    };
    // 1티비 전원입력
    tvarr[0].setOnOff(true);
    tvarr[0].setChennel(15);

    // 3티비
    tvarr[2].setOnOff(true);
    tvarr[2].setChennel(20);
  }
}
