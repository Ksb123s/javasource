package ch1;

public class PrintEx1 {
    public static void main(String[] args) {
        // 화면출력
        int var1 = 35, var2 = 25;
        boolean flag = true ;
        /* printf 지시자
         * %d : 10정수 형태로 출력
         * %b : bool 형태로 출력
         * %c : 문자 형태로 출력
         * %s : 문자열 형태로 출력
         * %f : 부동 소수점(float, double) 형태로 출력
         * 숫자 : 총 자릿수
         */
        System.out.println(var1 + ", " + var2 + ", " +flag);
        System.out.printf("var1 =%5d, var2 =%d, flag =%b\n", var1, var2, flag);

        float f1 = 3.141592f;
        double d1 = 31.41592d;
        System.out.printf("f1=%.5f\n", f1);
        System.out.printf("d1=%5.3f\n", d1);
    }
}
