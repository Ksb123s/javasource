package Class;

public class MemberCall {

  int iv = 10;
  static int cv = 20;

  static void staticMthode1() {
    //System.out.println(iv);
    System.out.println(cv);
  }

  void instanceMethode() {
    System.out.println(iv);
    System.out.println(cv);
  }
}
