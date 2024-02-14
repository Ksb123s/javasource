package exception;

public class WrongPasswordException extends Exception {

  public WrongPasswordException() {
    super();
  }

  public WrongPasswordException(String Message) {
    super(Message);
  }
}
