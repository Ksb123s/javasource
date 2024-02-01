package condition;

import java.util.Scanner;

public class IfEX4 {

  public static void main(String[] args) {
    // 점수가 90 이상이면 a , 80 이상 B, 70 이상이면 C 60 이상이면 D, f
    Scanner sc = new Scanner(System.in);
    System.out.println("점수를 입력해 주세요");
    int score = sc.nextInt();
    char grade;
    if (score >= 90) {
      //System.out.println("Grade: A");
      grade = 'A';
    } else if (score >= 80) {
      //System.out.println("Grade: B");
      grade = 'B';
    } else if (score >= 70) {
      // System.out.println("Grade: C");
      grade = 'C';
    } else if (score >= 60) {
      // System.out.println("Grade: D");
      grade = 'D';
    } else {
      // System.out.println("Grade: F");
      grade = 'F';
    }
    System.out.println("Grade :" + grade);
  }
}
