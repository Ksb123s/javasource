package inheritance;

/* package : 클래스 묶음
 * -자바의 모든 클래스는 하나의 패키지에 속해야 한다.
 * -패키지는 "."을 구분자로 하여 계층 구조로 구성
 *
 *
 */

// 상속 : 기존의 클래스를 재사용하여 새로운 클래스 작성
//        적은 양의 코드로 새로운 클래스를 작성할 수 있고 코드를 공통적으로 관리하기 때문에 코드이 추가 및 변경이 용이함
//        코드의 재사용성 증가 및 중복 제거
//        자손 클래스는 조상 클래스의 모든 멤버를 상속
//        생성자와 초기화 블럭은 상속 X
//        단일 상속
//        오버라이딩
//        - 부모의 메소드와 동일한 시그니처(리턴타입 ,메소드명, 인자)를 가진다
//        - 오버라이팅 메소드는 부모보다 접근 제한자를 좁게 가져서는 안됨
//        - 새로운 예외를 Throw 불가능
//        - 부모 메서드 재정의

//        모든 클래스는 Object 클래스를 상속받음

// parent : 부모클래스, 상위 클래스
// chiid : 자식 클래스, 하위 클래스, 파생클래스
public class Child extends Parent {

  private String name = "성춘향";

  // Child(){
  //     super();
  // }

  public Child(int age) {
    super(age);
  }

  void Play() {
    System.out.println("Play!!!");
  }

  @Override
  public void print() {
    super.print();
    System.out.println(" 내 이름은 " + name + " 입니다.");
  }
}
