package exam2;

public class ColorTVEx {

  public static void main(String[] args) {
    ColorTv myColor = new ColorTv(32, 1024);
    myColor.printProperty();

    IPTV iptv = new IPTV(32, 2048, "192.1.1.2");
  }
}
