package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* 컬렉션 프레임워크
 *  -데이터 군을 저장하는 클래스들을 표준화한 설계
 *
 * 1) Collection
 * (상속 인터페이스)     -List(인터페이스)
 *                          순서가 있는 테이터의 집합(테이터의 중복 허용)
 *                          -ArrayList, LinkedList,Stack,Vector ..
 *                      -배열과 동일한 개념 : 고정크기 => 크기 변경 시 내부적으로 알아서 처리함
 *
 * (상속 인터페이스)     -Set
 * (비상속 인터페이스)   -Map
 *
 *
 */

public class ArrayListEx {

  public static void main(String[] args) {
    // initial capacity : 10
    // List<Integer> ls = new ArrayList<>(20);
    ArrayList<Integer> ls = new ArrayList<>(20);

    ls.add(75); // append 개념
    ls.add(68);
    ls.add(35);
    ls.add(45);
    ls.add(55);
    ls.add(65);

    // toString() 오버라이딩 여부 체크
    System.out.println(ls); //[75, 68, 35, 45, 55, 65]

    // 내림차순 :Comparator.reverseOrder()
    // ls.sort(Comparator.reverseOrder());
    // 오름차순 :Comparator.naturalOrder()
    ls.sort(Comparator.naturalOrder());
    System.out.println(ls);

    ArrayList<String> ls2 = new ArrayList<>(20);

    ls2.add("java");
    ls2.add("jsp");
    ls2.add("HTML");
    ls2.add("CSS");
    ls2.add("JavaScript");
    ls2.add("Python");

    // 메소드
    // size() : ArrayList에 저장된 객체 개수
    System.out.println("size()" + ls2.size());

    // get() : 해당하는 배열 위치의 값을 출력
    System.out.println("get(3) : " + ls2.get(3));

    // indfexOf() : 해당하는 값의 위치 출력
    System.out.println("indexOf() :" + ls2.indexOf("java"));
    System.out.println("indexOf() :" + ls2.indexOf("JAVA"));

    // remove() : 해당하는 값을 리스트에서 제거 (true ,false 반환)
    System.out.println("remove() :" + ls2.remove("java"));
    System.out.println(ls2);
    // remove(index) : 해당하는 값을 리스트에서 제거(제거되는 값 반환)
    System.out.println("remove() :" + ls2.remove(2));
    System.out.println(ls2);

    // ArrayList => [] 로 변환
    //  toArray();
    Object[] arr = ls2.toArray();
    for (Object string : arr) {
      System.out.println(string);
    }

    // [] => ArrayList 변환
    // Arrays.asList
    int[] arr2 = { 1, 3, 5, 7, 9 };
    List<int[]> ls3 = Arrays.asList(arr2);
    System.out.println(ls3);

    // isEmpty() : 비어있는지 아닌지 비교 해주는 함수
    System.out.println("isEmpty() :" + ls2.isEmpty());

    // set() : 특정 위치에 값을 추가
    ls2.set(1, "Oracle");
    System.out.println("set() : " + ls2);
  }
}
