package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
    Arrays : 배열을 다루는데 유용한 메소드가 정의되어 있음
     -static 요소로 구성
  
  
 */
public class ArraysEx {

  public static void main(String[] args) {
    int[] arr = { 3, 2, 1, 0, 4, 5 };

    System.out.println(Arrays.toString(arr));

    int[] arr2 = new int[6];
    Arrays.fill(arr2, 9);
    System.out.println(Arrays.toString(arr2));

    System.out.println("배열 요소 비교 : " + Arrays.equals(arr, arr2));

    // Arrays.aslist(배열) : 배열을 list 구조로 변ㅅ경
    List<Integer> ls = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 });
    List<Integer> ls2 = Arrays.asList(6, 7, 8, 9, 10);

    // UnsupportedOperationException : 반환된 리스트 크기를 변경 불가
    // ls.add(6);

    List<Integer> ls3 = new ArrayList<>(
      Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 })
    );
    ls3.add(6);

    // sort : 오름차순
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    // linear search : 순차 검색(첫 번째 요소부터 하나씩 검색)
    // binarySearch() : 이진 검색(정렬(오름차순)된 상태여야함) 찾지 못하면 음수로 결과값이 나옴

    System.out.println("2번의 위치 : " + Arrays.binarySearch(arr, 2));

    // 내림차순
    // T[]  : 배열이 객체타입
    // Map<K,V> : K , V => 객체 타입
    // Collection<E> : E ==> 객체 타입
    Integer arr3[] = { 27, 55, 15, 6, 9, 8 };
    Arrays.sort(arr3, Comparator.reverseOrder());
    System.out.println(Arrays.toString(arr3));

    String[] strArr = { "cat", "Dog", "lion", "tiger", "apple", "zoo" };
    Arrays.sort(strArr);
    System.out.println(Arrays.toString(strArr));
    Arrays.sort(strArr, Comparator.reverseOrder());
    System.out.println(Arrays.toString(strArr));
  }
}
