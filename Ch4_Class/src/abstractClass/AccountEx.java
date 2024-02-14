package abstractClass;

// 추상 클래스
// 미완성 클래스 : 자식 클래스에서 완성

//  클래스 : 완성 설계도
public abstract class AccountEx {

  public static void main(String[] args) {
    // Cannot instantiate 인스턴스 생성 불가
    Account account = new CheckingAccount();
  }
}
