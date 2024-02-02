package Array;

import java.util.Arrays;

public class ArrayEx10 {

  public static void main(String[] args) {
    // 학생 10명의 점수를 관리

    int arr[] = { 25, 85, 55, 65, 5, 3 };

    int temp = 0;
    System.out.println(" 배열 정렬  전: " + Arrays.toString(arr));
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.println("오름차순으로 정렬: " + Arrays.toString(arr));
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] < arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.println("내림차순으로 정렬: " + Arrays.toString(arr));
  }
}
