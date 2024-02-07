package Class;

public class Person {

  private String name;
  private final String nation;

  // 객체들끼리 공유하는 상수
  // 상수는 대문자로 표현
  private static final double PI = 3.141592;

  // 멤버 변수에 final 이 붙으면 반드시 초기화 또는 선언 해야함 수정 불가
  // 상수 개념

  // 클레스에 final 이 붙으면 상속 금지
  //메소드에 final 붙을시 오버라이딩 금지

  public Person(String name, String nation) {
    this.name = name;
    this.nation = nation;
  }

  public static double getPi() {
    return PI;
  }

  public final String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + "]";
  }
}
