package Array;

import java.util.Arrays;

public class ArrayEx8 {

  public static void main(String[] args) {
    // 학생 10명의 점수를 관리

    int numArr1[] = new int[45];
    for (int i = 0; i < numArr1.length; i++) {
      numArr1[i] = i + 1;
    }
    System.out.println(Arrays.toString(numArr1));

    int temp = 0;
    // i는 자리를 바꿀 대상 위치 번호
    for (int i = 0; i < 6; i++) {
      int changNum = (int) (Math.random() * 45);
      temp = numArr1[changNum];
      numArr1[changNum] = numArr1[i];
      numArr1[i] = temp;
    }
    System.out.println(Arrays.toString(numArr1));
  }
}
