package abstractClass;

// 추상 클래스
// 미완성 클래스 : 자식 클래스에서 완성
// 추상 메소드
//  인스턴스 생성 불가

//  클래스 : 완성 설계도
public abstract class Account {

  private String accountNo;

  public Account() {}

  public Account(String accountNo) {
    this.accountNo = accountNo;
  }

  public void deposit() {}

  // 추상 메소드 => {} 없음
  public abstract void print();
}
