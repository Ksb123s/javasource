package condition;

import java.util.Scanner;

public class SwitchEx3 {

  // switch 조건문
  //  if ~ else if 대체
  public static void main(String[] args) {
    // 가위 :1, 바위 :2, 보 :3
    // 3-1 = 2
    Scanner sc = new Scanner(System.in);
    System.out.println("가위(1) 바위(2) 보(3) 입력 해주세요");
    int com = 0;
    com = (int) (Math.random() * 3) + 1;
    int Player = sc.nextInt();
    /*
    switch (Player) {
      case 1:
        System.out.println("computer" + com);
        if (com == 3) {
          System.out.println("player win");
        } else if (com == 2) {
          System.out.println("player Lose");
        } else {
          System.out.println("draw");
        }
        break;
      case 2:
        System.out.println("computer" + com);
        if (com == 1) {
          System.out.println("player win");
        } else if (com == 3) {
          System.out.println("player Lose");
        } else {
          System.out.println("draw");
        }
        break;
      case 3:
        System.out.println("computer" + com);
        if (com == 2) {
          System.out.println("player win");
        } else if (com == 1) {
          System.out.println("player Lose");
        } else {
          System.out.println("draw");
        }
        break;
      default:
        System.out.println("잘못입력하셨습니다.");
        break;
    }
     */
    int result = com - Player;
    switch (result) {
      case -2:
      case 1:
        System.out.println("computer" + com);
        System.out.println("player Lose");
        break;
      case -1:
      case 2:
        System.out.println("computer" + com);
        System.out.println("player win");
        break;
      case 0:
        System.out.println("computer" + com);
        System.out.println("draw");
        break;
      default:
        System.out.println("잘못입력하셨습니다.");
    }
  }
}
