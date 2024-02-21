package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamEx1 {

  public static void main(String[] args) {
    try ( // try-with- resource : try() 닫아야 할 자원들을 선언하면 자동으로 닫아줌
      InputStream in = new FileInputStream(new File("C:\\temp\\file1.txt"));
      OutputStream out = new FileOutputStream("C:\\temp\\file1_copy.txt");
    ) {
      int data = 0;
      byte[] b = new byte[1024];
      while ((data = in.read(b)) != -1) {
        out.write(b);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
