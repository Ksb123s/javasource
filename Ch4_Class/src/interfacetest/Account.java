package interfacetest;

//  interface
// 모든 멤버 변수는 public static final 이여야 함
//  모든 멤버 메소드는 public abstract임 (abstract 생략 가능)
//  추상화가 높은 상태(기본 설계도)
//  body 를 가진 메소드는 static , defualt 만 가능(1.8 버전 추가)
//  여러 개 구현 가능
//  public class Bonuse implements Account,CheckingAccount
//  public class Bonuse extends CredLine implements Account,CheckingAccount

public interface Account {
  // Illegal modifier for the interface field Account.accountNo; only public, static & final are permitted
  // private String accountNo;
  public static final int SPADE = 4; //상수만 가능

  // Abstract methods do not specify a body
  // public void deposit(){}
  public void deposit();

  // static, default 이 붙어있으면 생성 가능 바디
  static void getCardKind() {}

  default void getCard() {}
}
