package exam;

public class DiceSum {

  public static void main(String[] args) {
    // 주사위 두개를 굴려 나오는 숫자를 굴려
    // 두 주사위 숫자의 합이 5 일떄 중단 (int)(Math.random() * 6 +1)
    int dice1 = 0, dice2 = 0, sum = 0;

    while (true) {
      dice1 = (int) (Math.random() * 6 + 1);
      dice2 = (int) (Math.random() * 6 + 1);
      sum = dice1 + dice2;
      System.out.printf("(%d, %d)주사위 합: %d\n", dice1, dice2, sum);
      if (sum == 5) {
        break;
      } else {
        sum = 0;
      }
    }
  }
}
