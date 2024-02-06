package Exam;

import java.util.Scanner;

public class TriangleEx1 {
  {
    //  임의값 부여
    Triangle triangle = new Triangle(15, 9);

    double result = triangle.getArea();
    System.out.println("삼각형의 넓이는" + result);

    //  렌덤 함수 사용
    int baseLine = (int) (Math.random() * 100 + 1);
    int height = (int) (Math.random() * 100 + 1);

    Triangle triangle2 = new Triangle(baseLine, height);

    double result2 = triangle2.getArea();
    System.out.println("삼각형의 넓이는" + result2);

    // 집적 값을 입력 받음

    Scanner sc = new Scanner(System.in);

    System.out.println("밑변을 입력해 주세요.");
    int baseLine2 = sc.nextInt();
    System.out.println("높이를 입력해 주세요.");
    int height2 = sc.nextInt();

    Triangle triangle3 = new Triangle(baseLine2, height2);

    double result3 = triangle3.getArea();
    System.out.println("삼각형의 넓이는" + result3);
  }
}
