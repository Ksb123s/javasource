package Operator;

public class ConditionEx1 {

  //조건연산자 : 조건식 ? 식1 : 식2;
  public static void main(String[] args) {
    //x가 y보다 크면 x값을 변수에 담고 아니면 y 값을 담는다.

    int x = 45, y = 789;
    int num = (x > y) ? x : y;
    System.out.printf("Result = %d\n", num);

    // 점수가 90 이상이면 A, F

    int score = 80;
    System.out.println((score > 90) ? "A" : "F");

    // 점수가 90이상이면 A 80이상이면 B ,f
    System.out.println((score >= 90) ? "A" : (score >= 80) ? "B" : "F");
  }
}
