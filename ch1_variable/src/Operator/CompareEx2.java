package Operator;

public class CompareEx2 {

  public static void main(String[] args) {
    int num1 = 10, num2 = 10;
    // 비교 연산자 결과는 true or false 로 나온다.
    // 문자 vs 문자열
    //  ''  vs  ""
    // 'a'  vs   "as"
    // 문자열 비교는 equals() 사용

    String str1 = "홍길동";
    String str2 = "홍길동";
    String str3 = new String("홍길동");

    System.out.println(str1 == str2);
    System.out.println(str1 == str3);
    System.out.println(str1.equals(str3));
  }
}
