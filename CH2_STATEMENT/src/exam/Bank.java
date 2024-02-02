package exam;

import java.util.Scanner;

public class Bank {

  public static void main(String[] args) {
    /*
     *
     *
     */
    Scanner sc = new Scanner(System.in);
    boolean run = true;
    int balance = 0, withdraw = 0;
    while (run) {
      System.out.println("----------------------------------");
      System.out.println("1.예금 | 2. 출금 | 3.잔고 | 4. 종료");
      System.out.println("----------------------------------");
      System.out.println("메뉴 선택 >>");

      int menu = sc.nextInt();

      switch (menu) {
        case 4:
          System.out.println("프로그램 종료");
          balance = 0;
          withdraw = 0;
          run = false;
          break;
        case 3:
          System.out.printf("당신의 잔고는 %d원 입니다.\n", balance);
          System.out.println();
          break;
        case 2:
          while (menu == 2) {
            System.out.println(" 얼마를 출력 하겠습니까? 잔액: " + balance);
            withdraw = sc.nextInt();
            if (withdraw > balance) {
              System.out.println("잔액이 부족합니다.");
            } else if (withdraw <= balance) {
              balance -= withdraw;
              System.out.println("출금이 완료 되었습니다.");
              menu = 0;
            }
          }
          break;
        case 1:
          System.out.println(" 얼마를 입금 하겠습니까? 잔액: " + balance);
          balance += sc.nextInt();
          System.out.println("입금이 완료 되었습니다. 잔액:" + balance);
          break;
      }
    }
  }
}
