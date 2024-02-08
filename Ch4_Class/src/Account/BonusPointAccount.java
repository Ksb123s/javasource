package Account;

// 은행 : Account
// 은행 + 체크 : CheckingAccount
// 은행 + 체크 + 교통카드 : CheckingTrafficCardAccount
// 은행 + 마이너스 : CreditLineAccount
//  은행 + 보너스 포인트(예금액의 0.1%)

public class BonusPointAccount extends Account {

  private int bounsPoint;

  public BonusPointAccount(
    String accountNo,
    String owner,
    int balance,
    int bounsPoint
  ) {
    super(accountNo, owner, balance);
    this.bounsPoint = bounsPoint;
  }

  @Override
  public void deposit(int amount) {
    this.bounsPoint += (int) (amount * 0.001);
    super.deposit(amount);
  }

  public int getBounsPoint() {
    return bounsPoint;
  }
}
