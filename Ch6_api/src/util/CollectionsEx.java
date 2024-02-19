package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 Collections 클래스 
  - 컬랙션과 관련된 메소드 제공
  - 전부 static 요소로 구성
  - 동기화, fill(), copy(), sort(), binarySearch() 유용한 메소드 제공

  - Collection 인터페이스
 */
public class CollectionsEx {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println(list);

    // 오른쪽으로 두 칸씩 이동
    Collections.rotate(list, 2);
    System.out.println(list);

    Collections.swap(list, 0, 2);
    System.out.println(list);

    // Collections.sort(list, Collections.reverseOrder());
    Collections.sort(list, Comparator.naturalOrder());
    // list.sort(Comparator.reverseOrder());
    System.out.println(list);

    System.out.println(
      "5가 저장된 위치를 찾고싶어요 : " + Collections.binarySearch(list, 7)
    );
    System.out.println("최대값 : " + Collections.max(list));
    System.out.println("최소값 : " + Collections.min(list));

    Collections.fill(list, 9);
    System.out.println(list);
  }
}
