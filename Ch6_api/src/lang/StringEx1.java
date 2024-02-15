package lang;

// java.lang.String : 문자열 클래스
//  - 변경 불가능 (imutable)한 클래스 : 읽기만 rksmd
public class StringEx1 {

  public static void main(String[] args) {
    String str1 = new String("abc");
    String str2 = "abc";
    String str3 = "abc";

    System.out.println(str2 == str3 ? "같음" : "다름"); // 같음
    System.out.println(str2 == str1 ? "같음" : "다름"); // 다름

    // String equals() 오버라이딩 : 값 비교
    System.out.println("equals() 결과");
    System.out.println(str2.equals(str3) ? "같음" : "다름"); // 같음
    System.out.println(str2.equals(str1) ? "같음" : "다름"); // 다름

    String a = "a";
    String b = "b";
    a = a + b; // 문자열 결합 횟수가 많다면 효울성이 떨어짐 => StringBuffer, StringBuilder 사용
  }
}
