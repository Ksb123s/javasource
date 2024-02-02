package Loop;

public class WhileEx1 {

  public static void main(String[] args) {
    int i = 0;
    while (i < 5) {
      System.out.println("i can do it.");
      i++;
    }
    i = 0;
    int sum = 0;
    while (i <= 10) {
      sum += i;
      i++;
    }
    System.out.println("1~10까지의 합 :" + sum);
  }
}
