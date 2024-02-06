package Exam;

public class AcountEx {

  public static void main(String[] args) {
    Account account = new Account("356-78963-1234", "홍길동", 1200000);

    int balance = 0;

    balance = account.dposit("356-78963-1234", 120000);

    System.out.println("현재 잔액" + balance + "\n");
    balance = account.dposit("356-78963-1235", 120000);

    System.out.println("현재 잔액" + balance + "\n");

    balance = account.withdraw("356-78963-1234", 120000);
    System.out.println("현재 잔액" + balance + "\n");

    balance = account.withdraw("356-78963-1235", 120000);
    System.out.println("현재 잔액" + balance + "\n");

    balance = account.withdraw("356-78963-1234", 120000000);
    System.out.println("현재 잔액" + balance + "\n");
  }
}
