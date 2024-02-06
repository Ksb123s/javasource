package Array;

import java.util.Arrays;

public class ArrayEx13 {

  // 2차원
  public static void main(String[] args) {
    int sum = 0;
    int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
    int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 } };
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr1[i].length; j++) {
        System.out.printf(arr1[i][j] + "\t");
        sum += arr[i][j];
      }
      System.out.println();
    }
    System.out.println("배열의 합" + sum);
  }
}
