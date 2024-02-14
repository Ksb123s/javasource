package exception;

//  사용자 정의 예외
public class BalanceInsuffcientException extends Exception {

  public BalanceInsuffcientException() {
    super();
  }

  public BalanceInsuffcientException(String Message) {
    super(Message);
  }
}
