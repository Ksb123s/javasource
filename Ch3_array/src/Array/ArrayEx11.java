package Array;

import java.util.Arrays;

public class ArrayEx11 {

  // 알고리즘 - 정렬 : 선택정렬(sort), 버블정렬, 합정렬 ... 등
  public static void main(String[] args) {
    String[] names = { "Kim", "Park", "Choi" };

    for (String str : names) {
      System.out.println(str);
    }

    for (int i = 0; i < names.length; i++) {
      String str = names[i];
      for (int j = 0; j < names.length; j++) {
        char ch = str.charAt(j);
        System.out.printf("str.charAt(%d) : %c\n", j, ch);
      }
    }

    String src = "abcd";
    char[] chArr = src.toCharArray();
    System.out.println(chArr);
  }
}
