package ch1;

//자동 형(타입) 변환
// 정수형/문자형/논리형/실수형
// 타입 변환 가능함 : 작은타입 => 큰 타입
// 연산시 타입변환이 일어남 : 작은타입=> 큰 타입
public class PromotionEx1 {

  public static void main(String[] args) {
    byte v1 = 10;
    int inValue = v1;
    System.out.println("inValue :" + inValue);

    short s1 = 15;
    inValue = s1;
    System.out.println("inValue :" + inValue);
    //문자타입이 숫자로 표현
    char ch1 = 'a';
    inValue = ch1;
    System.out.println("inValue :" + inValue);

    // float type 이 int 보다 더 정밀한 수 표현
    //int(4) => float(4byte)
    float floatValue = inValue;
    System.out.println("floatValue :" + floatValue);

    // 8byte
    long longValue = inValue;
    System.out.println("longValue :" + longValue);

    //소수점이 자동으로 붙게 됨
    double doubleValue = inValue;
    System.out.println("doubleValue :" + doubleValue);

    //  int + double
    inValue = 55;
    doubleValue = 98.25d;
    double result = inValue + doubleValue;
    System.out.println("int + double 타입으로 변환됨");
    System.out.println(result);
    // byte v2 = 15;

    // byte byteValue = v1+ v2 ; => 정수를 변수에 담는다면 int 사용
    // int byteValue = v1+ v2 ;
  }
}
