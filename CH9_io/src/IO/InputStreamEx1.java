package IO;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//  java.io.* : io(input/output)
//  기본 input : 키보드
//  기본 output : 화면

// 스트림 : 입출력을 수행할 때 어느 한 쪽에서 다른 쪽으로 데이터 전달시 드 대상을 연결하는 통로 개념
//          -단방향만 가능 (입력 , 출력) => 2개의 스트림 필요
// 1. 바이트 기반 스트림
//      -InputStream(추상 클래스) : 입력 스트림 부모
//      -OutputStream(추상 클래스) : 출력 스트림 부모
// 2. 문자 기반 스트림
//          Reader(추상)
//          Writer(추상)

public class InputStreamEx1 {

  public static void main(String[] args) {
    InputStream in = System.in;
    // in.read(); : 한 바이트씩 읽어와서 int 로 리턴
    // in.read(byte[] b); : byte[] 로 읽어와서 int 로 리턴
    // in.read(byte[] b, 0, 100); :byte[] 로 읽어와서 특정 위치에 해당하는 것만 리턴

    OutputStream out = System.out;
    // out.write(byte[] b);
    // out.write(int);
    // out.write(byte[] b, 0, 100);

    try {
      //   int input = in.read();
      //   out.write(input);

      // 여러바이트
      //   int input = 0;
      //   while ((input = in.read()) != -1) {
      //     System.out.println((char) input);
      //     out.write(input);
      //   }
      byte[] b = new byte[100];
      in.read(b);
      // System.out.println(Arrays.toString(b));
      out.write(b);

      in.close();
      out.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
