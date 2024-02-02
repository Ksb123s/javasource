package Array;

import java.util.Arrays;

public class ArrayEx5 {

  public static void main(String[] args) {
    // 배열명 Arr선언 ,생성
    // 1,2,3,4,5

    int Arr[] = { 1, 2, 3, 4, 5 };

    // 기존 배열의 arr 크기의 2배를 가지는 새로운 배열 생성 temp

    int temp[] = new int[Arr.length * 2];

    for (int i = 0; i < Arr.length; i++) {
      temp[i] = Arr[i];
    }
    int temp2[] = new int[Arr.length * 2];
    System.arraycopy(Arr, 0, temp2, 5, Arr.length);
    System.out.println(Arrays.toString(temp2));
  }
}
