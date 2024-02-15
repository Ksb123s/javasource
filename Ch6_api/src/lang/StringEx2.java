package lang;

import java.util.Date;

// java.lang.String : 문자열 클래스
public class StringEx2 {

  public static void main(String[] args) {
    // 생성자

    String str1 = new String("Hello");
    char[] chars = { 'H', 'e', 'l', 'l', 'o' };

    String str2 = new String(chars);
    String str3 = "Hello";

    // 메소드
    // return type => 변수 담기 or sout
    char ch = str1.charAt(0);
    // charAt() : 인덱스 위치 문자 반환
    System.out.println("charAt(0) : " + ch);
    System.out.println("charAt(3) : " + str2.charAt(3));

    // concat(): 문자열 간의 연결
    String result = str1.concat(str3);
    System.out.println("concat() : " + result);

    // compareTo : 0 ,-1,1 리턴
    // 문자열 과 사전 순서로 비교
    //  같이면 0 , 사전순으로 이전이면 음수, 이후면 양수
    System.out.println("compareTo()" + str1.compareTo(str3));
    System.out.println("compareTo()" + "aaa".compareTo("bbb"));
    System.out.println("compareTo()" + "bbb".compareTo("aaa"));
    System.out.println("compareTo()" + "bbb".compareTo("baa"));
    System.out.println("compareTo()" + "kzs".compareTo("aaa"));

    // contains : 지정된 문자열이 포함되어 있는지 검사
    System.out.println("contain() : " + str1.contains("e"));

    // endwith : 지정돤 문자열이 끝나는지 검사
    System.out.println("endwith() : " + str3.endsWith("t"));
    System.out.println("endwith() : " + "Hello.txt".endsWith("txt"));

    // startwith 지정된 문자열로 시작하는지 검사
    System.out.println("startwith() : " + str3.startsWith("H"));

    // equals() / equalsIgnoreCase() : 대소문자 구분 하지 말고 비교
    System.out.println("equalsIgnoreCase() :" + str1.equalsIgnoreCase("HELLO"));
    System.out.println("equals() :" + str1.equals("HELLO"));

    // indexOf : 주어진 문자의 존재여부(-1) 및 위치 반환(0~ 상수)
    System.out.println("indexOf() :" + str1.indexOf("s"));
    System.out.println("indexOf() :" + str1.indexOf('s'));
    System.out.println("indexOf() :" + str1.indexOf('e'));
    System.out.println("indexOf() :" + str1.indexOf('e', 2)); // 시작 위지 설정

    // lastIndexOf() : 지정된 문자를문자열의 오른쪽 끝에서부터 찾음
    String str4 = "java.lang.String";
    System.out.println("lastIndexOf() :" + str4.lastIndexOf(".")); //9
    System.out.println("IndexOf() :" + str4.indexOf(".")); // 4

    // length() : 문자열길이 반환

    // replace() : 해당하는 문자르 특정 문자로 변경
    System.out.println("replace() : " + str1.replace('H', 'o'));
    str2 = str2.replace('H', 'h');
    System.out.println(str2);
    str2 = str2.replace("ll", "LL");
    System.out.println(str2);

    str4 = "Hellollo";
    System.out.println("replcae() :" + str4.replace("ll", "LL"));
    System.out.println("replaceAll() :" + str4.replaceAll("ll", "LL"));
    System.out.println("replaceFirst() :" + str4.replaceFirst("ll", "LL")); // 해당하는 첫 문자만 변경

    // split() : 문자열 분리(기준에 따라) 후 배열로 리턴
    String[] strArr = str1.split("");
    for (String string : strArr) {
      System.out.println(string);
    }

    str4 = "dog,cat,bear";
    strArr = str4.split(",");
    for (String string : strArr) {
      System.out.println(string);
    }
    // 문자열 전체를 지정된 숫자로 자른다.
    strArr = str4.split(",", 2);
    for (String string : strArr) {
      System.out.println(string);
    }

    // substring() : 시작위치부터 끝 위치에 포함된  문자열 추출
    //                끝 위치는 포함 x
    System.out.println("substring() : " + str1.substring(1));
    System.out.println("substring() : " + str1.substring(1, 4));

    //toLowerCase() : 모든 문자를 소문자로
    //toUpperCase() : 모든 문자를 대문자로
    System.out.println("toLowerCase() :" + str1.toLowerCase());
    System.out.println("toUpperCase() :" + str1.toUpperCase());

    // toString()
    System.out.println(str1);
    System.out.println(str1.toString());

    // 공백 하나는 문자 하나
    // trim() : 앞 , 뒤 공백 제거
    // "Hello" == "Hello "
    str4 = "  Hello     World";
    System.out.println("trim() 전 " + str4);
    System.out.println("trim() 후 " + str4.trim());

    // valueOf : 지정된 값을 문자열로 변환하여 반환
    String num1 = String.valueOf(100); //int => String
    num1 = String.valueOf(1.3); // double => String
    num1 = String.valueOf(1.3f);
    num1 = String.valueOf(10000l);
    num1 = String.valueOf('c');
    Date date = new Date();
    num1 = String.valueOf(date);
    System.out.println(num1);

    int i = 100;
    String type = String.valueOf(i);
    type = i + "";

    // String.valueOf(10) <=> Integer.parseInt("10") or Integer.valueOf("10")
    // String.valueOf(10.3) <=> Integer.parseDouble("10.3") or Double.valueOf("10.3")
    // "10.3f" => 10.3f
    double d1 = Double.valueOf("10.3");
    float f1 = Float.parseFloat("10.3f");
    Long.parseLong("1000l");
    //
  }
}
