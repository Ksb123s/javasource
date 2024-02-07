package Exam;

import java.util.Scanner;

public class BankApp {

  static int count = 0, balance, balance2, check = 0;
  static String accountNo, owner;
  static Scanner sc = new Scanner(System.in);
  static Account accArr[] = new Account[100];

  public static void main(String[] args) {
    boolean run = true;
    int menu = 0;
    while (run) {
      System.out.println("------------------------------------------------");
      System.out.println("1계좌생성 | 2.계좌목록| 3.예금 | 4.출금 | 5.종료");
      System.out.println("------------------------------------------------");
      System.out.println("메뉴 선택 >>");
      menu = Integer.parseInt(sc.nextLine());
      switch (menu) {
        case 1:
          createAccount();
          break;
        case 2:
          accountList();
          break;
        case 3:
          deposit();
          break;
        case 4:
          withdraw();
          break;
        case 5:
          System.out.println("시스템을 종료합니다.");
          run = false;
          break;
        default:
          break;
      }
    }
  }

  static void createAccount() {
    System.out.println("계좌 번호 >>");
    accountNo = sc.nextLine();
    System.out.println("성함 입력 >>");
    owner = sc.nextLine();
    System.out.println("계좌 잔액 입력 >>");
    balance = Integer.parseInt(sc.nextLine());

    accArr[count] = new Account(accountNo, owner, balance);
    count++;
  }

  static void accountList() {
    for (int i = 0; i < count; i++) {
      System.out.println((i + 1) + "번" + accArr[i]);
    }
  }

  static void deposit() {
    // System.out.println("입금 계좌 입력 >>");
    // accountNo = sc.nextLine();
    // System.out.println("입금액 입력 >>");
    // balance = Integer.parseInt(sc.nextLine());
    // for (Account account : accArr) {
    //   if (account != null) {
    //     account.dposit(accountNo, balance);
    //   }
    // }
    // System.out.println("입금 계좌 입력 >>");
    // accountNo = sc.nextLine();
    // for (int i = 0; i < count; i++) {
    //   if (accountNo.equals(accArr[i].getAccountNo())) {
    //     System.out.println("입금액 입력 >>");
    //     balance = Integer.parseInt(sc.nextLine());
    //     balance2 = accArr[i].getBalance();
    //     accArr[i].setBalance(balance2 + balance);
    //     System.out.println(
    //       "현재 계좌 잔액 : " +
    //       balance2 +
    //       " 입금액 :" +
    //       balance +
    //       " 입금후 :" +
    //       accArr[i].getBalance()
    //     );
    //     break;
    //   } else {
    //     check++;
    //     continue;
    //   }
    // }
    // if (check == count) {
    //   System.out.println("계좌번호를 잘못 입력 하셨습니다.");
    // }
    // check = 0;
    System.out.println("입금 계좌 입력 >>");
    balance = Integer.parseInt(sc.nextLine());
    System.out.println("입금 계좌 입력 >>");
    accountNo = sc.nextLine();
    Account account = FindAccount(accountNo);

    if (account != null) {}
  }

  static void withdraw() {
    System.out.println("출금 계좌 입력 >>");
    accountNo = sc.nextLine();
    for (int i = 0; i < count; i++) {
      if (accountNo.equals(accArr[i].getAccountNo())) {
        System.out.println("출금액 입력 >>");
        balance = Integer.parseInt(sc.nextLine());
        if (accArr[i].getBalance() < balance) {
          System.out.println("잔액이 부족 합니다.");
          break;
        } else {
          accArr[i].setBalance(accArr[i].getBalance() - balance);
          break;
        }
      } else {
        check++;
        continue;
      }
    }
    if (check == count) {
      System.out.println("계좌번호를 잘못 입력 하셨습니다.");
    }
    check = 0;
  }

  static Account FindAccount(String accountNo) {
    for (Account account : accArr) {
      if (account != null) {
        if (account.getAccountNo().equals(accountNo)) {
          return account;
        }
      }
    }
    return null;
  }
}
