package inheritance;

public class Tv {

  private boolean power;
  private int channel;

  public Tv(boolean power, int channel) {
    this.power = power;
    this.channel = channel;
  }

  public boolean isPower() {
    return power;
  }

  public int getChannel() {
    return channel;
  }

  public Tv() {}

  void Power() {
    power = !power;
  }

  void ChannelUp() {
    channel++;
  }

  void ChannelDown() {
    channel--;
  }
}
