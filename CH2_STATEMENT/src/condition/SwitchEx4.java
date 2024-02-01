package condition;

import java.util.Scanner;

public class SwitchEx4 {

  // switch 조건문
  //  if ~ else if 대체
  public static void main(String[] args) {
    // A or a : 우수회원
    // B or b : 일반회원
    //  else : 손님
    Scanner sc = new Scanner(System.in);
    System.out.println("정보를 입력해주세요");
    String grade = sc.nextLine();

    switch (grade) {
      case "a":
      case "A":
        System.out.println("우수회원");
        break;
      case "b":
      case "B":
        System.out.println("일반회원");
        break;
      default:
        System.out.println("손님");
        break;
    }
  }
}
