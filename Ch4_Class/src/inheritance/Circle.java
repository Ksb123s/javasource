package inheritance;

//  원(circle) 은 점(point) 이다. => circle is a point
//  원(circle) 은 점(point)을 가지고 있다 => circle has a point

// 상속관계 (isa)
// public class Circle extends Point {

//   int r;//반지름 r
// }

//  포함관계(Hasa): 한 클래스의 멤버변수로 다른 클래스의 타입의 참조 변수를  선언
public class Circle {

  Point p = new Point();

  int r;
}
