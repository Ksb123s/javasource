package Exam;

import Class.Student2;
import java.util.Scanner;

public class AccountEx2 {

  public static void main(String[] args) {
    Account accArr[] = new Account[3];
    String accountNo, onwer;
    int balance;

    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < accArr.length; i++) {
      System.out.println("계좌번호를  입력해 주세요");
      accountNo = sc.nextLine();
      System.out.println("성함을 입력해 주세요");
      onwer = sc.nextLine();
      System.out.println("잔액을  입력해 주세요");
      balance = Integer.parseInt(sc.nextLine());
      accArr[i] = new Account(accountNo, onwer, balance);
    }

    for (Account account : accArr) {
      System.out.println(account);
    }
  }
}
