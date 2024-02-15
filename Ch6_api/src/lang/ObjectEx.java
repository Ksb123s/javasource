package lang;

// java.lang * =>  import 없이 생성 가능 , 기본 패키지

//  java.lang.Object  : 모든 클래스의 최고 조상
//            equals() 는 == 과 같은 역할 (주소비교)
//             toString() 은 객체가 저장된 주소 전달
public class ObjectEx {

  public static void main(String[] args) {
    // 인스턴스 생성
    Object obj1 = new Object();
    Object obj2 = new Object();

    if (obj1.equals(obj2)) {
      System.out.println("두 객체는 같다.");
    } else {
      System.out.println("두 객체는 다르다.");
    }

    if (obj1 == obj2) {
      System.out.println("두 객체는 같다.");
    } else {
      System.out.println("두 객체는 다르다.");
    }

    System.out.println(" obj1 toString" + obj1.toString());
    System.out.println(" obj2 toString" + obj2.toString());

    Value value1 = new Value(1200);
    Value value2 = new Value(1200);

    if (value1.equals(value2)) {
      System.out.println("두 객체는 같다.");
    } else {
      System.out.println("두 객체는 다르다.");
    }

    System.out.println(" Values toString" + value1.toString());
    System.out.println(" Values toString" + value1);

    Member member1 = new Member("홍123");
    Member member2 = new Member("홍123");

    System.out.println(member1.equals(member2) ? "같다" : "다르다");
    System.out.println(member1 == member2 ? "같다" : "다르다");

    System.out.println(" member toString" + member1);

    Person p1 = new Person("홍123", "홍길동");
    Person p2 = new Person("홍123", "홍길동");

    System.out.println(p1.equals(p2) ? "같다" : "다르다");
    System.out.println(p1 == p2 ? "같다" : "다르다");
  }
}
