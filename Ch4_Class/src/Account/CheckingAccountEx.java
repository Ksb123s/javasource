package Account;

public class CheckingAccountEx {

  public static void main(String[] args) throws Exception {
    CheckingAccount cAccount = new CheckingAccount(
      "123-456-789",
      "Hong",
      "1234-1233",
      100000
    );
    System.out.println("잔액 :" + cAccount.getBalance());

    cAccount.Pay("1234-1233", 10000);

    System.out.println("잔액 :" + cAccount.getBalance());

    CheckingTrafficCardAccount checkingTrafficCardAccount = new CheckingTrafficCardAccount(
      "123-4567-78",
      "Kim",
      "123-456",
      30000000,
      true
    );
    checkingTrafficCardAccount.payTrfficCard("123-456", 100000);
    try {
      System.out.println(checkingTrafficCardAccount.getBalance());
    } catch (Exception e) {
      e.printStackTrace();
    }

    CreditLineAccount creditLineAccount = new CreditLineAccount(
      "123-456",
      "Kim",
      10000,
      5000000
    );
    try {
      creditLineAccount.withdraw(4500000);
      System.out.println(
        creditLineAccount.getOwner() +
        "현재 잔액" +
        creditLineAccount.getBalance()
      );
    } catch (Exception e) {
      e.printStackTrace();
    }
    BonusPointAccount bonusPointAccount = new BonusPointAccount(
      "1234-6857",
      "kim",
      10000,
      0
    );

    try {
      bonusPointAccount.deposit(50000);
      bonusPointAccount.deposit(50000);
      System.out.println(
        bonusPointAccount.getOwner() +
        "의 현재 잔액은 " +
        bonusPointAccount.getBalance() +
        " 포인트 :" +
        bonusPointAccount.getBounsPoint()
      );
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
