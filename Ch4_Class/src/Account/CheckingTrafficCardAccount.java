package Account;

public class CheckingTrafficCardAccount extends CheckingAccount {

  // 은행 + 체크 + 교통카드
  // 기능 : 예금, 출금/(부모기능 : Account)  ,카드사용금액 지불 (부모 : checkingAccount)   , 교통비 지불 : 선불 ,후불
  private Boolean hasTrChCard;

  public CheckingTrafficCardAccount(
    String accountNo,
    String owner,
    String cardNo,
    int balance,
    Boolean hasTrChCard
  ) {
    super(accountNo, owner, cardNo, balance);
    this.hasTrChCard = hasTrChCard;
  }

  // 카드번호, 체크카드 기능 , amount
  public void payTrfficCard(String cardNo, int amount) throws Exception {
    if (!this.hasTrChCard) {
      throw new Exception("교통카드 기능이 없습니다.");
    } else {
      this.Pay(cardNo, amount);
    }
  }
}
