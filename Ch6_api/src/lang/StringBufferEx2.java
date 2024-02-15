package lang;

public class StringBufferEx2 {

  public static void main(String[] args) {
    StringBuffer sb1 = new StringBuffer("Hello");
    // StringBuffer sb2 = "Hello"; 불가능

    // append(): 원본 문자열 뒤에 추가

    System.out.println("append() :" + sb1.append(" World"));
    sb1.append("123").append(456).append(12.3f);
    System.out.println(sb1);

    // charAt()
    System.out.println(sb1.charAt(3));

    // delete() : 지정된 사이에 값을 제거
    System.out.println(sb1.delete(3, 6));
    sb1.deleteCharAt(5);
    System.out.println(sb1);

    // insert()
    sb1.insert(4, "012345");
    System.out.println(sb1);

    // length()

    // replace()
    sb1.replace(0, 3, "AB");
    System.out.println(sb1);

    String str2 = "0123456789";
    // 9876543210
    for (int i = (str2.length() - 1); i >= 0; i--) {
      System.out.print(str2.charAt(i));
    }
    System.out.println();

    StringBuffer sb3 = new StringBuffer("0123456789");
    System.out.println(sb3.reverse());

    //  String <=> StringBuffer
    StringBuffer sb4 = new StringBuffer(str2);
    System.out.println(sb4.reverse());

    sb1.setCharAt(1, 'k');
    System.out.println(sb1);

    StringBuilder sBuilder = new StringBuilder("Hello");
  }
}
