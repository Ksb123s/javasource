package ch1;

// 변수의 유효범위
// local(지역) 변수 : {} 안에서만 유효 ** 무조건 초기화 하고 사용
// 1.변수선언 2. 값 할당(초기화)
public class VarScopeEx1 {

        public static void main(String[] args) {
             int v2 = 30;
             int v3 ;
             //int v4;
            {
            int v1 = 15;
            v3 = v1+ v2;
            System.out.println("v1 :" +v1);
            System.out.println("v3 :" +v3);
            }
            System.out.println("v2 : "+ v2);
            //The local variable v4 may not have been initialized : 로컬 변수 v4 가 초기화 되지 않음
            //System.out.println("v4 : "+ v4);
        }
        void print(){
            // main 메소드 안에 선언된 변수 사용 가능?
            // no (v2 cannot be resolved to a variable)
            //System.out.println(v2);
    }

}
