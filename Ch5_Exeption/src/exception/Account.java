package exception;

public class Account {

  private int balance;

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  // new Xeception() - > 컴파일 예외
  //  new RuntimeException() -> 런타임 예외
  public void withdraw(int money) throws BalanceInsuffcientException {
    if (balance < money) {
      throw new BalanceInsuffcientException("잔액 부족");
    }
  }
}
