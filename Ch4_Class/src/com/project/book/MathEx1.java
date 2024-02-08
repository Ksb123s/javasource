package com.project.book;

//  java.lang 패키지는 기본 import 상태

import static java.lang.Math.*;

// math 클래스는 모든 요소가 static상태
public class MathEx1 {

  public static void main(String[] args) {
    System.out.println(PI);
    System.out.println(E);
    System.out.println(random());
    System.out.println(ceil(3.41));
  }
}
