package util;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenEx3 {

  public static void main(String[] args) {
    //  키보드로 입력을 받아 문자열을 분리하는 프로그램
    //  입력 ) / 기준으로 분리
    Scanner sc = new Scanner(System.in);

    System.out.println("입력해 주세요 (구분 /) =>");
    String str = sc.nextLine();
    StringTokenizer st1 = new StringTokenizer(str, "/");
    System.out.println();
    while (st1.hasMoreTokens()) {
      System.out.println(st1.nextToken());
    }
  }
}
