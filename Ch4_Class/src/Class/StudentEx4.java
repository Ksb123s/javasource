package Class;

import java.util.Scanner;

public class StudentEx4 {

  public static void main(String[] args) {
    Student3 stuArr[] = new Student3[3];
    Scanner sc = new Scanner(System.in);
    // System.out.println(stuArr[0]);
    // System.out.println(stuArr[0].getId());

    for (int i = 0; i < stuArr.length; i++) {
      stuArr[i] = new Student3();
      System.out.println();
      //아이디, 이름,국어 , 영어, 수학점수
      System.out.println((i + 1) + "번째 학생의 아이디를 입력해 주세요");
      stuArr[i].setId(sc.nextLine());

      System.out.println((i + 1) + "번째 학생의 이름을 입력해 주세요");
      stuArr[i].setName(sc.nextLine());

      System.out.println((i + 1) + "번째 학생의 국어 점수를 입력해 주세요");
      stuArr[i].setKor(Integer.parseInt(sc.nextLine()));

      System.out.println((i + 1) + "번째 학생의 영어 점수를 입력해 주세요");
      stuArr[i].setEng(Integer.parseInt(sc.nextLine()));

      System.out.println((i + 1) + "번째 학생의 수학 점수를 입력해 주세요");
      stuArr[i].setMath(Integer.parseInt(sc.nextLine()));
    }
    System.out.println("=================================================");
    System.out.println("아이디  이름    국어    영어    수학    총점    평균");
    System.out.println("=================================================");
    for (Student3 student3 : stuArr) {
      System.out.printf(
        "%s\t%s\t%d\t%d\t%d\t%d\t%d\t\n",
        student3.getId(),
        student3.getName(),
        student3.getKor(),
        student3.getEng(),
        student3.getMath(),
        (student3.getKor() + student3.getEng() + student3.getMath()),
        (student3.getKor() + student3.getEng() + student3.getMath()) / 3.0
      );
    }
    // for (int i = 0; i < stuArr.length; i++) {
    //   //   System.out.println(student3);
    //   System.out.printf(
    //     "%s\t%s\t%d\t%d\t%d\t%d\t%d\t\n",
    //     stuArr[i].getId(),
    //     stuArr[i].getName(),
    //     stuArr[i].getKor(),
    //     stuArr[i].getEng(),
    //     stuArr[i].getMath(),
    //     (stuArr[i].getKor() + stuArr[i].getEng() + stuArr[i].getMath()),
    //     (stuArr[i].getKor() + stuArr[i].getEng() + stuArr[i].getMath()) / 3.0
    //   );
    // }
  }
}
