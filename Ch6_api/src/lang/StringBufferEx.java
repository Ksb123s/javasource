package lang;

// java.lang.StringBuffer : mutable (변경 가능한) 클래스 ,thread-safe
// java.lang.StringBuilder : mutable (변경 가능한) 클래스
public class StringBufferEx {

  public static void main(String[] args) {
    StringBuffer sb1 = new StringBuffer("Hello");
    StringBuffer sb2 = new StringBuffer("Hello");
    // equals() : 주소비교 , toString()
    // String 으로 변환후 equals() 사용
    System.out.println(sb1.equals(sb2) ? "같음" : "다름");
    System.out.println(sb1 == sb2 ? "같음" : "다름");
    System.out.println(sb1);

    String str1 = new String(sb1);
    String str2 = new String(sb2);

    System.out.println(str1.equals(str2) ? "같음" : "다름");
    System.out.println(str1 == str2 ? "같음" : "다름");
    System.out.println(str1);

    String str3 = sb1.toString();
    String str4 = sb2.toString();

    System.out.println(str3.equals(str4) ? "같음" : "다름");
    System.out.println(str3 == str4 ? "같음" : "다름");
    System.out.println(str3);
  }
}
