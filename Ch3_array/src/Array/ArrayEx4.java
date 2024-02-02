package Array;

import java.util.Arrays;

public class ArrayEx4 {

  public static void main(String[] args) {
    char chArr[] = { 'a', 'b', 'c', 'd' };
    System.out.println(chArr);

    int intArr[] = { 78, 88, 9, 86, 55 };
    System.out.println(Arrays.toString(intArr));

    String strArr[] = { "abc", "asdf", "hig", "apple" };

    System.out.println(Arrays.toString(strArr));

    // 배열 복사

    int temp[] = new int[intArr.length * 2];
    for (int i = 0; i < 5; i++) {
      temp[i] = intArr[i];
    }
    // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    intArr = temp;
    System.out.println("복사후" + Arrays.toString(intArr));
  }
}
