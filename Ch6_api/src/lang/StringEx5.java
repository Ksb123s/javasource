package lang;

public class StringEx5 {

  public static void main(String[] args) {
    System.out.println(count("12345AB12AB345AB", "AB"));
    System.out.println(count("12345", "AB"));
  }

  public static int count(String src, String target) {
    // src 에 target이 몇번 나오는지 카운팅후 반환
    int count = 0;
    int state = 0;
    // for (int i = 0; i < src.length(); i = state) {
    //   if (src.indexOf(target, i) != -1) {
    //     count += 1;
    //     state = src.indexOf(target, i) + target.length();
    //   } else {
    //     state += 1;
    //     continue;
    //   }
    // }

    while ((state = src.indexOf(target, state)) != -1) {
      count++;
      state += target.length();
    }
    return count;
  }
}
