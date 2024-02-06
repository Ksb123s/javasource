package Class;

public class Student2 {

  // 멤버 변수(instance 변수 , property) - 학생이라는 객체가 가져야 하는 특징
  // 학번(20241011), 이름(홍길동),주소(서울시 종로구), 주민번호(240000-4000000), 핸드폰(010-1234-5678)

  private String id;
  private String name;
  private String hp;
  private String addr;

  //멤버메소드(instance mathod, 기능)
  // 속성을 변경시킬 수 있도록 메소드 작성

  void changeAdrr() {}

  void changeHp() {}

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getHp() {
    return hp;
  }

  public void setHp(String hp) {
    this.hp = hp;
  }

  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  // 생성자(constructor)
  // 클래스를 객체로 생성할때 필수로 필요

  @Override
  public String toString() {
    return "[id:" + id + "name:" + name + "hp:" + hp + "addr:" + addr + " ]";
  }
}
