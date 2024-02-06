package Class;

public class Numbers {

  private int num[];

  public Numbers(int[] num) {
    this.num = num;
  }

  int getTotal() {
    int sum = 0;
    for (int i = 0; i < num.length; i++) {
      sum += num[i];
    }
    return sum;
  }

  int getAverage() {
    return getTotal() / num.length;
  }
}
