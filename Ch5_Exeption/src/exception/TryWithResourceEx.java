package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//  자동 자원 반환 - try-with-resource
public class TryWithResourceEx {

  public static void main(String[] args) {
    // FileInputStream fil = null;
    // try {
    //   fil = new FileInputStream("test.txt");
    // } catch (FileNotFoundException e) {
    //   e.printStackTrace();
    // } finally {
    //   if (fil != null) {
    //     try {
    //       fil.close();
    //     } catch (IOException e) {
    //       e.printStackTrace();
    //     }
    //   }
    // }

    // try() 안에는 close 할 객체들이 들어감
    // 자동으로 닫아줌 (finally 를 명시하지 않아도 됨)
    try (FileInputStream fil = new FileInputStream("test.txt")) {
      fil.read();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
