package Class;

import java.util.Scanner;

public class StudentEx3 {

  public static void main(String[] args) {
    Student2 stuArr[] = new Student2[3];
    // stuArr[0] = new  Student2("st1014", "홍길동", "서울");
    // stuArr[1] = new  Student2("st1015", "김유신", "부산");
    // stuArr[2] = new  Student2("st1016", "선춘향", "대구");

    // // 첫번째 학생 휴태폰 번호 등록
    // stuArr[0].setHp("010--1234-5678");

    // // 3번째 학생 주소 변경
    // stuArr[2].setAddr("서울");

    // 학생 정보 입력 받기

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < stuArr.length; i++) {
      System.out.println((i + 1) + "번째 학생의 학번을 입력해 주세요");
      String id = sc.nextLine();
      //stuArr[i].setId(sc.nextLine());
      System.out.println((i + 1) + "번째 학생의 이름을 입력해 주세요");
      String name = sc.nextLine();
      //stuArr[i].setName(sc.nextLine());
      System.out.println((i + 1) + "번째 학생의 주소를 입력해 주세요");
      String addr = sc.nextLine();
      //stuArr[i].setAddr(sc.nextLine());

      stuArr[i] = new Student2(id, name, addr);
    }

    for (Student2 student2 : stuArr) {
      System.out.println(student2);
    }
  }
}
