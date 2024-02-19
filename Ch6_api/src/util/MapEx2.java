package util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
  Map 인터페이스
  - Key, Value 를 하나의 쌍으로 묶어서 저장
  - Key는 중복불가, Value는 중복가능
  - 구현클래스 : Hashtable, HashMap,TreeMap...
  - 내부 인터페이스 Map Entry
 
 
 */

public class MapEx2 {

  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();

    map.put("myId", "1234");
    map.put("asdf", "1111");
    map.put("asdf", "1234");

    Set<String> keys = map.keySet();
    System.out.println(keys);

    Collection<String> values = map.values();
    System.out.println(values);

    // 아이디 와 패스워드 입력 받아 map 에 들어 있는지 체크
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println(" Input ID >>");
      String id = sc.nextLine().trim();
      System.out.println(" Input Password >>");
      String pwd = sc.nextLine().trim();
      if (!map.containsKey(id)) {
        System.out.println("Wrong Id Try again");
        continue;
      } else if (!map.containsValue(pwd)) {
        System.out.println("Wrong Password Try Again");
        continue;
      } else {
        System.out.println("login Complite");
        break;
      }
    }
  }
}
