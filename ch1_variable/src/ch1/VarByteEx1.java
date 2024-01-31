package ch1;

public class VarByteEx1 {
    public static void main(String[] args) {//데이터 타입
        /* 정수형  
         * byte(1byte), short(2byte) , int(4byte), long(8byte)
         * 변수명 규칙 (권고)
         * 1. 변수명은 소문자로 시작
         * 2. 한글은 가능하지만 사용 x
         * 3. 어떤 값이 들어갈지 유추가능하도록 명 작성
         * 4. 2개의 단어가 합쳐질때 2번째 단어 시작을 대문자로 시작
         */

         byte age = 10, maxSpeed = 10;
         short age2 = 10, maxSpeed2 = 10;
         int age3 = 15, maxSpeed3 = 20;



         age = -128;// -128~~ 127 까지 표현
         //long타입은 값에 L(1) 붙이기
         long age4 = 123456789, maxSpeed4 = 1000000000000L;


        System.out.println(age +" , "+ maxSpeed);
        System.out.println( "나이: "+ age2+", 최고속도"+ maxSpeed2);
        System.out.println( "나이: "+ age3+", 최고속도"+ maxSpeed3);
        System.out.println( "나이: "+ age4+", 최고속도"+ maxSpeed4);


        
    }

}
