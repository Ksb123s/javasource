package condition;

public class SwitchEx1 {

  // switch 조건문
  //  if ~ else if 대체
  public static void main(String[] args) {
    char ch1 = 'a';

    switch (ch1) {
      case 'a':
        System.out.println("a입니다.");
        break;
      case 'b':
        System.out.println("b입니다.");
        break;
      case 'd':
        System.out.println("c입니다.");
        break;
      default:
        System.out.println("a,b,c 아닙니다.");
        break;
    }
  }
}
