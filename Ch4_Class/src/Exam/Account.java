package Exam;

public class Account {

  private String accountNo;
  private String owner;
  private int balance;

  public Account() {}

  public String getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public Account(String accountNo, String owner, int balance) {
    this.accountNo = accountNo;
    this.balance = balance;
    this.owner = owner;
  }

  int dposit(String accountNo, int money) {
    if (this.accountNo.equals(accountNo)) {
      this.balance += money;

      return this.balance;
    } else {
      System.out.println("계좌번호가 잘못 되었습니다.");
      return this.balance;
    }
  }

  int withdraw(String accountNo, int money) {
    if (this.accountNo.equals(accountNo)) {
      if (this.balance < money) {
        System.out.println("잔액이 부족합니다.");
        return this.balance;
      } else {
        this.balance -= money;
        return this.balance;
      }
    } else {
      System.out.println("계좌번호가 잘못 되었습니다.");
      return this.balance;
    }
  }

  @Override
  public String toString() {
    return (
      " 계좌 [계좌 번호=" +
      accountNo +
      ", 성함=" +
      owner +
      ", 잔액=" +
      balance +
      "]"
    );
  }
}
