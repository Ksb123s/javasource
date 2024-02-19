package util;

import java.util.Collection;
import java.util.Collections;
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

public class MapEx4 {

  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();

    map.put("홍길동", 95);
    map.put("김길동", 92);
    map.put("박길동", 88);
    map.put("이길동", 69);
    map.put("장길동", 72);

    // 홍길동 : 95

    // 1) key 값만 set구조로 변경 후 접근

    Set<String> set = map.keySet();
    Iterator<String> iterator = set.iterator();
    //NoSuchElementException
    while (iterator.hasNext()) {
      String key = iterator.next();
      int score = map.get(key);
      System.out.println(key + " : " + score);
    }

    System.out.println("명단 : " + set);

    System.out.println();
    //  점수 전체 가저오기
    Collection<Integer> scores = map.values();
    Iterator<Integer> iterator2 = scores.iterator();
    int total = 0;
    while (iterator2.hasNext()) {
      total += iterator2.next();
    }

    System.out.println("총점 : " + total);
    System.out.println("평균 : " + (double) total / set.size());

    System.out.println("최고점수 : " + Collections.max(scores));
    System.out.println("최저점수 : " + Collections.min(scores));
    // Set<Entry<String, Integer>> entries = map.entrySet();
    // Iterator<Entry<String, Integer>> iterator2 = entries.iterator();
    // while (iterator2.hasNext()) {
    //   Entry<String, Integer> entry = iterator2.next();
    //   System.out.println(entry.getKey() + " : " + entry.getValue());
    // }
  }
}
