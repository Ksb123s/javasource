package condition;

import java.util.Scanner;

public class IfEX5 {

  public static void main(String[] args) {
    // 점수를 입력 받은후 점수에 따라 출력
    // 당신의 점수는 100 입니다.
    //  당신의 학점은 A+ 입니다.
    Scanner sc = new Scanner(System.in);
    System.out.println("점수를 입력해 주세요");
    int score = sc.nextInt();
    String grade = " ", otp = " ";
    if (score >= 90) {
      grade = "A";
      if (score >= 98) {
        otp = "+";
      } else if (score < 94) {
        otp = "-";
      }
    } else if (score >= 80) {
      grade = "B";
      if (score >= 88) {
        otp = "+";
      } else if (score < 84) {
        otp = "-";
      }
    } else if (score >= 70) {
      grade = "C";
      if (score >= 78) {
        otp = "+";
      } else if (score < 74) {
        otp = "-";
      }
    } else if (score >= 60) {
      grade = "D";
      if (score >= 68) {
        otp = "+";
      } else if (score < 64) {
        otp = "-";
      }
    } else {
      grade = "F";
    }
    System.out.println("당신의 점수는 " + score + "입니다.");
    System.out.println("Grade :" + otp + grade);
  }
}
