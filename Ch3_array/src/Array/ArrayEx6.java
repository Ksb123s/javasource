package Array;

import java.util.Arrays;

public class ArrayEx6 {

  public static void main(String[] args) {
    // 학생 10명의 점수를 관리
    int Score[] = { 90, 80, 78, 90, 45, 65, 87, 89, 100, 50 };

    // 최고/ 최저 점수를 받은 학생 출력
    int max = 0, min = 0, total = 0;
    double Avg = 0;
    max = Score[0];
    min = Score[0];
    /*
    for (int i = 1; i < Score.length; i++) {
      if (max < Score[i]) {
        max = Score[i];
      }
      if (min > Score[i]) {
        min = Score[i];
      }
    }
    System.out.printf("최대 : %d 최소 : %d\n", max, min);
*/
    for (int i : Score) {
      if (i > max) {
        max = i;
      }
      if (i < min) {
        min = i;
      }
      total += i;
    }
    Avg = total / (double) Score.length;
    System.out.printf(
      "최대 : %d, 최소 : %d, 점수 총합 : %d , 평균 : %2.2f\n",
      max,
      min,
      total,
      Avg
    );
  }
}
