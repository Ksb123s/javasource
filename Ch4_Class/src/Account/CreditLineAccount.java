package Account;

// 은행 : Account
// 은행 + 체크 : CheckingAccount
// 은행 + 체크 + 교통카드 : CheckingTrafficCardAccount
// 은행 + 마이너스

public class CreditLineAccount extends Account {

  private int creditLine; // 마이너스 한도

  public CreditLineAccount(
    String accountNo,
    String owner,
    int balance,
    int creditLine
  ) {
    super(accountNo, owner, balance);
    this.creditLine = creditLine;
  }

  @Override // 잔액 = 잔액 + 마이너스 한도
  public void withdraw(int amount) throws Exception {
    if (amount > (getBalance() + creditLine)) {
      throw new Exception("인출 불가");
    }
    super.setBalance(super.getBalance() + creditLine);
    super.withdraw(amount);
  }
}
