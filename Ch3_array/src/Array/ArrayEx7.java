package Array;

import java.util.Arrays;

public class ArrayEx7 {

  public static void main(String[] args) {
    // 학생 10명의 점수를 관리
    int numArr[] = new int[10];

    for (int i = 0; i < numArr.length; i++) {
      numArr[i] = i;
    }
    System.out.println(Arrays.toString(numArr));

    int temp = 0;
    // 무작위로 숫자 위치 변경
    for (int i = 0; i < 100; i++) {
      int pos = (int) (Math.random() * 10);

      temp = numArr[0];
      numArr[0] = numArr[pos];
      numArr[pos] = temp;
    }
    System.out.println(Arrays.toString(numArr));

    int numArr2[] = new int[45];
    for (int i = 1; i <= numArr.length; i++) {
      numArr[i] = i;
    }
  }
}
