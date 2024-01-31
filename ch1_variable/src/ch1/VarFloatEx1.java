package ch1;

/* 변수 : 하나의 값을 저장하기 위한 공간
 * 타입지정 - 정수형, 문자형 ,논리형 , 실수형
 * 값은 변할수 있다
 * 1byte = 8bit = 256개 (0~255 표현)
 * 
 * 상수 : 값을 한번만 저장하는 장소 (설정 이후 불변)
 *        final int WIDTH =20;
 */

public class VarFloatEx1 {
        public static void main(String[] args) {
            /* 실수형
             * float(4byte) , double(8byte)
             * 
             */
            float score1= 90.17f;
            double score2= 98.5d;
            System.out.println("점수 : "+score1);
            System.out.println("점수 : "+score2);

            float var3 = 0.12345690123456789f;
            double var4 = 0.12345690123456789d;
            System.out.println("Var3 :" +var3);
            System.out.println("Var4 :" +var4);
        }
}
