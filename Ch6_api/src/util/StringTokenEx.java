package util;

import java.util.StringTokenizer;

public class StringTokenEx {

  public static void main(String[] args) {
    String result = "100,200,300,400";
    String[] deilmeter = result.split(",");
    for (String string : deilmeter) {
      System.out.println(string);
    }

    StringTokenizer st = new StringTokenizer(result, ",");

    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
  }
}
