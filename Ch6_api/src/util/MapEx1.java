package util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
  Map 인터페이스
  - Key, Value 를 하나의 쌍으로 묶어서 저장
  - Key는 중복불가, Value는 중복가능
  - 구현클래스 : Hashtable, HashMap,TreeMap...
  - 내부 인터페이스 Map Entry
 
 
 */

public class MapEx1 {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();

    map.put("id_0123", "홍길동");
    map.put("id_0124", "박보검");
    map.put("id_0125", "송준기");
    map.put("id_0126", "현빈");

    System.out.println(
      " key에 해당하는 value 가저오기 get() :" + map.get("id_0125")
    );
    System.out.println(
      " key 존재여부 containsKey() :" + map.containsKey("id_0125")
    );
    System.out.println(
      " Value 존재여부 containsValue() :" + map.containsValue("송준기")
    );
    System.out.println(" Map 요소 크기 size() :" + map.size());
    System.out.println(" Map 요소 삭제 remove() :" + map.remove("id_0126"));

    // 키 값 모두 가져오기
    Set<String> keys = map.keySet();
    System.out.println(keys);

    //  value 값 모두 가져오기
    Collection<String> values = map.values();
    System.out.println(values);
  }
}
