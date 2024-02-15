package lang;

public class StringEx4 {

  public static void main(String[] args) {
    String[] names = { "Kim", "Park", "Hong", "Choi" };
    System.out.println(findKim(names));
  }

  public static String findKim(String[] arr) {
    // int state = 0;
    // for (String string : arr) {
    //   if (string.indexOf("Kim") != -1) {
    //     return String.valueOf(state);
    //   } else {
    //     state += 1;
    //   }
    // }
    // return null;
    int state = 0;
    for (String string : arr) {
      if (string.contains("Kim")) {
        break;
      } else {
        state += 1;
      }
    }
    return "Kim 은" + state + "번 위치에 있다";
  }
}
