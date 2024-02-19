package util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
  Map 인터페이스
  - Key, Value 를 하나의 쌍으로 묶어서 저장
  - Key는 중복불가, Value는 중복가능
  - 구현클래스 : Hashtable, HashMap,TreeMap...
  - 내부 인터페이스 Map Entry
 
 
 */

public class MapEx3 {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();

    map.put("id_0123", "홍길동");
    map.put("id_0124", "박보검");
    map.put("id_0125", "송준기");
    map.put("id_0126", "현빈");

    // iterator 사용시
    // 키 값만 모두 가져오기
    Set<String> set = map.keySet();
    // key 값을 Iterator 구조로 변경
    Iterator<String> iterator = set.iterator();

    while (iterator.hasNext()) {
      String key = iterator.next();
      String value = map.get(key);
      System.out.println(key + " : " + value);
    }

    System.out.println();

    // Map => Map.Entry 내부 인터페이스로 가지고 있음
    //
    Set<Entry<String, String>> entries = map.entrySet();
    Iterator<Entry<String, String>> iterator2 = entries.iterator();
    while (iterator2.hasNext()) {
      Entry<String, String> entry = iterator2.next();
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }
}
