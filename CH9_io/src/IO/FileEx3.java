package IO;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.xml.crypto.Data;

public class FileEx3 {

  public static void main(String[] args) throws IOException {
    File temp = new File("C:\\temp");
    File dir = new File("C:\\temp\\dir");
    File file1 = new File("C:\\temp\\file1.txt");
    File file2 = new File(temp, "file2.txt");
    File file3 = new File("C:\\temp\\dir\\file3.txt");
    File file4 = new File("C:\\temp\\dir\\Hello.java");

    if (!dir.exists()) {
      dir.mkdirs();
    }
    if (!file1.exists()) {
      file1.createNewFile();
    }
    if (!file2.exists()) {
      file2.createNewFile();
    }
    if (!file3.exists()) {
      file3.createNewFile();
    }
    if (!file4.exists()) {
      file4.createNewFile();
    }

    // temp 폴더 읽어오기

    File[] files = temp.listFiles();

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
    // 날짜 시간 형태 크기 이름

    System.out.println(
      "==========================================================="
    );
    System.out.println("     날짜     시간    형태      크기      이름 ");
    System.out.println(
      "==========================================================="
    );
    for (File file : files) {
      String fileName = file.getName();
    //   Date date = new Date(file.lastModified());
      System.out.print(sdf.format(new Date(file.lastModified())));
    //   file.lastModified() : 11970-1-1 시작으로 현재 오늘날짜 까지의 시간을 밀리세컨드로 돌려줌
      if (file.isDirectory()) {
        System.out.println("\s<DIR>\t\t\s\s\s" + fileName);
      } else {
        System.out.println("\t\t" + file.length() + "\t" + fileName);
      }
    }
  }
}
