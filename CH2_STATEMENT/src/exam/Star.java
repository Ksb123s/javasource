package exam;

public class Star {

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      for (int k = 4; k > i; k--) {
        System.out.print(' ');
      }
      for (int j = 0; j <= i; j++) {
        System.out.print('*');
      }
      System.out.println("");
    }

    System.out.println();
    //뒤집기
    for (int i = 0; i < 5; i++) {
      for (int k = 0; k < i; k++) {
        System.out.print(' ');
      }
      for (int j = 5; j > i; j--) {
        System.out.print('*');
      }
      System.out.println("");
    }
  }
}
