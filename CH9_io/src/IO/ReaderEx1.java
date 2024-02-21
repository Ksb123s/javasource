package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Arrays;

// 2. 문자 기반 스트림
//          Reader(추상)
//          Writer(추상)

// Charset 표준
// ISO-8859-1, UTF-8, UTF-16
public class ReaderEx1 {

  public static void main(String[] args) {
    Reader reader = null;
    Writer Writer = null;
    try {
      reader = new FileReader("C:\\temp\\file1.txt", Charset.forName("utf-8"));
      // reader.read(); :  하나의 문자 읽어오기
      // reader.read(char[] cbuf);  :입력 소스로 부터 배열의 크기만큼 읽어서 배열에 저장
      // reader.read(char[] cbuf, int off, int len); 입력 소스로 부터 len 개만큼 읽어서 배열의 off 위치에 저장

      Writer = new FileWriter("C:\\temp\\test3.txt");
      // Writer.write(String str);
      // Writer.write(int ch);
      // Writer.write(char[] chuf);

      int data = 0;
      char[] chuf = new char[1024];

      while ((data = reader.read(chuf)) != -1) {
        // System.out.print((char) data);
        // Writer.write(chuf);

        Writer.write(new String(chuf));
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        reader.close();
        Writer.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
