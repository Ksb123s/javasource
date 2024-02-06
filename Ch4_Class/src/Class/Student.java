package Class;

public class Student {

  // 멤버 변수(instance 변수 , property) - 학생이라는 객체가 가져야 하는 특징
  // 학번(20241011), 이름(홍길동),주소(서울시 종로구), 주민번호(240000-4000000), 핸드폰(010-1234-5678)

  static String id;
  String name;
  String hp;
  String addr;

  //멤버메소드(instance mathod, 기능)
  // 속성을 변경시킬 수 있도록 메소드 작성

  void changeAdrr() {}

  void changeHp() {}

  // 생성자(constructor)
  // 클래스를 객체로 생성할때 필수로 필요

  Student() {}
}
