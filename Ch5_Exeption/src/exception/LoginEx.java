package exception;

import java.util.Scanner;

// 사용자로부터 아이디와 비밀번호 입력받기

// 아이디가 blue 가 일치하지 않으면 no...

//  비밀번호가 12345 가 아니면 wrong
public class LoginEx {

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input Id : ");
    String id = scanner.nextLine();
    System.out.println("Input Password : ");
    String Pwd = scanner.nextLine();
    try {
        Login(id, Pwd);
    } catch (NoExisitIdException | WrongPasswordException e) {
        e.printStackTrace();
    }
  }

  public static void Login(String ID, String Password)
    throws NoExisitIdException, WrongPasswordException {
    if (!ID.equals("blue")) {
      throw new NoExisitIdException(" 아이디를 잘못 입력하셨습니다.");
    }
    if (!Password.equals("12345")) {
      throw new WrongPasswordException("비밀번호 오류");
    }
  }
}
