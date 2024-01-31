package ch1;

public class VarCharEx1 {
        public static void main(String[] args) {
            /* 문자형
             * char(2byte) - '' 사용
             *  문자 (한글자) vs 문자열 (한글자 이상)
             *    ''                ""
             */
            char Name = 'J';
            char Var1 = '\u0041';//유니코드, 또는 아스키코드에 65 에 해당하는 문자 출력
            char Var2 = 44032;

            // String Name2 = "ja";
            System.out.println("이름 : " + Name);
            System.out.println("Var1 : " + Var1);
            System.out.println("Var2 : " + Var2);
            // System.out.println("이름 : " + Name2);

        }
}
