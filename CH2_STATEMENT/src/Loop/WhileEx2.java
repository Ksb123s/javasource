package Loop;

public class WhileEx2 {

  public static void main(String[] args) {
    int i = 1;
    while (i < 10) {
      System.out.printf("%d * %d = %d\n", 3, i, (3 * i));
      i++;
    }
  }
}
