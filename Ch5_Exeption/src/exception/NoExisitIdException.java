package exception;

public class NoExisitIdException extends Exception {

  String id;

  public NoExisitIdException() {
    super();
  }

  public NoExisitIdException(String Message) {
    super(Message);
  }
}
