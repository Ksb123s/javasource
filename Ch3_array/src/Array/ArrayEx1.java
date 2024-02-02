package Array;

public class ArrayEx1 {

  public static void main(String[] args) {
    /* 배열 : 같은 타입의 변수를 하나의 묶음으로 처리
     *  array
     * int 타입의 변수를 5개 만들기
     *  int[] Arr1 = new int[5] ;
     */
    int[] Arr1 = new int[5];
    int Arr2[][] = new int[10][10];

    boolean Arr3[] = new boolean[2];

    char Arr4[] = new char[5];

    System.out.println(Arr1); //[I@6842775d 메모리 주소
    System.out.println(Arr1[0]); // 해당 배열 에 존재 하는 값 출력
    System.out.println(Arr2[0][0]);
    System.out.println(Arr3[0]);
    System.out.println(Arr4[0]);
  }
}
