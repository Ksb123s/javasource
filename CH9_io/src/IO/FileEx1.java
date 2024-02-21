package IO;

import java.io.File;
import java.io.IOException;

// java.io.File : 파일과 디렉토리를 다룰 수 있음
//  경로 구분자 : window => \, linux | unix => /

public class FileEx1 {

  public static void main(String[] args) throws IOException {
    // file 객체 생성
    File f1 = new File("C:\\temp\\test1.txt");
    File f2 = new File("C:\\temp", "test1.txt");

    File dir = new File("C:\\temp\\");
    File f3 = new File(dir, "test.txt");

    String fileName = f1.getName();
    int pos = fileName.lastIndexOf(".");

    System.out.println("경로를 제외한 파일" + f1.getName());
    System.out.println("확장자를 제외한 파일" + fileName.substring(0, pos));
    System.out.println("확장자" + fileName.substring(pos + 1));
    // 경로 메소드
    System.out.println(" 경로를 포함한 파일명" + f1.getPath());
    System.out.println("파일의 절대 경로" + f1.getAbsolutePath());
    System.out.println("파일의 정규 경로" + f1.getCanonicalPath());
    System.out.println("파일이 속해 있는 디렉토리" + f1.getParent());
    System.out.println();
    // 경로 구분자
    System.out.println("File.pathSeparator -" + File.pathSeparator);
    System.out.println("File.pathSeparatorChar -" + File.pathSeparatorChar);
    System.out.println("File.Separator -" + File.separator);
    System.out.println("File.SeparatorChar -" + File.separatorChar);
    System.out.println();
    System.out.println("User.dir -" + System.getProperty("user.dir"));
  }
}
