package Array;

import java.util.Arrays;

public class ArrayEx9 {

  public static void main(String[] args) {
    // 학생 10명의 점수를 관리

    int[] code = { -4, -1, 3, 6, 11 };
    int arr[] = new int[10];

    int temp = 0;
    for (int i = 0; i < arr.length; i++) {
      temp = (int) (Math.random() * code.length);
      arr[i] = code[temp];
    }
    System.out.println(Arrays.toString(arr));
  }
}
