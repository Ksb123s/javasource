package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx15 {

  // 2차원
  public static void main(String[] args) {
    // 1차원 배열 - 사용자 입력 값으로 배열 초기와

    int[][] score = {
      { 100, 95, 98 },
      { 20, 20, 18 },
      { 30, 30, 38 },
      { 40, 55, 45 },
      { 50, 48, 68 },
    };

    // 학생들의 점수 총점과 평균 출력
    // 번호 국어 영어 수학 총점 평균
    int Msum = 0, Lsum = 0, Esum = 0;
    System.out.print("번호\t국어\t영어\t수학\t총점\t평균\n");
    for (int i = 0; i < score.length; i++) {
      int sum = 0;
      Msum += score[i][0];
      Esum += score[i][1];
      Lsum += score[i][2];
      System.out.printf(i + 1 + "\t");
      for (int j = 0; j < score[i].length; j++) {
        System.out.printf(score[i][j] + "\t");
      }

      System.out.printf("%d\t%2.2f\n", sum, sum / 3.0);
    }
    System.out.printf("총점\t%d\t%d\t%d\n", Msum, Esum, Lsum);
  }
}
