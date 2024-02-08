package inheritance;

public class CaptionTv extends Tv {

  boolean caption;

  void displayCaption(String text) {
    if (caption) {
      System.out.println(text);
    }
  }

  public CaptionTv(boolean power, int channel, boolean caption) {
    super(power, channel);
    this.caption = caption;
  }

  public CaptionTv(boolean caption) {
    this.caption = caption;
  }
}
