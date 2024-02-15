package lang;

public class StringEx3 {

  public static void main(String[] args) {
    String str1 = new String("Hello!! Java");

    // 문자열  =>char[] 변경

    // str1.length() : str1 의 길이 리턴
    char ch1[] = new char[str1.length()];
    for (int i = 0; i < str1.length(); i++) {
      ch1[i] = str1.charAt(i);
    }

    System.out.println(ch1);

    String str2 = "자바 프로그래밍";

    //  프 라는 문자가 존재 한다면 "들어있음"

    if (str2.contains("프")) {
      System.out.println("들어있음");
    } else {
      System.out.println("없음.");
    }

    System.out.println(str1.contains("프") ? "들어있음" : "없음");
  }
}
