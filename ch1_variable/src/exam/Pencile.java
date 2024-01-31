package exam;

import java.util.Scanner;

public class Pencile {

  public static void main(String[] args) {
    /*  534자루의 연필을 30명의 학생들에게 똑같은 개수로
     * 나눌때 학생 한 명 당 몇 개를 가질 수 있고, 최종적으로 몇 개가  남는지 출력하시오
     * 변수 사용
     */
    Scanner sc = new Scanner(System.in);
    int Pencile = 534, student = 30;
    int result1 = Pencile / student;
    int remain = Pencile % student;

    System.out.printf(
      "학생당 나눠줄수 있는 연필 수는 %d개 이고 남은건 %d개 이다 ",
      result1,
      remain
    );

    System.out.println("연필 수량 입력");
    int Pencile2 = sc.nextInt();
    System.out.println("학생 수 입력");
    int student2 = sc.nextInt();

    int result2 = Pencile2 / student2;
    int remain2 = Pencile2 % student2;

    System.out.printf(
      "학생당 나눠줄수 있는 연필 수는 %d개 이고 남은건 %d개 이다 ",
      result2,
      remain2
    );

    sc.close();
  }
}
