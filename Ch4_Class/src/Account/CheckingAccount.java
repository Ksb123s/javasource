package Account;

public class CheckingAccount extends Account {

  private String cardNo;

  public CheckingAccount(
    String accountNo,
    String owner,
    String cardNo,
    int balance
  ) {
    super(accountNo, owner, balance);
    this.cardNo = cardNo;
  }

  // pay(str cardno, int amount)
  //

  public void Pay(String cardNo, int amount) throws Exception {
    if (cardNo.equals(this.cardNo)) {
      if (getBalance() >= amount) {
        // setBalance(getBalance() - amount);
        withdraw(amount);
      } else {
        throw new Exception("잔액이 부족합니다.");
      }
    } else {
      throw new Exception("카드 번호가 일치하지 않습니다.");
    }
  }

  public String getCardNo() {
    return cardNo;
  }
}
