package inheritance;

public class ChildEx {

  public static void main(String[] args) {
    //  부모, 자식 따로  인스턴스 생성 가능
    Parent parent = new Parent(15);
    Child child = new Child(20);
    Child2 child2 = new Child2(25);
    GrandChild grandChild = new GrandChild(15);

    System.out.println("부모의 멤버 변수" + parent.getAge());
    System.out.println("부모가 물려준 멤버 변수 child" + parent.getAge());
    System.out.println("부모가 물려준 멤버 변수 child2" + parent.getAge());
    System.out.println("child 멤버 메소드.");
    child.Play();
    System.out.println("Parent가 물려준 멤버 변수 " + grandChild.getAge());
    grandChild.Play(); // child 가 물려준 멤버 메소드

    //  오버라이딩 메소드

    parent.print(); //나이는 15 입니다.
    child.print(); //내 이름은 성춘향입니다.
    child2.print(); // 나이는 15입니다.
    grandChild.print(); //내 이름은 성춘향입니다.
  }
}
