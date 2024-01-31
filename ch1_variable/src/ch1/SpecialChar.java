package ch1;

public class SpecialChar {
        public static void main(String[] args) {
            /*  \t : 문자 내부에 텝 사용
             *  \n : 문자 간의 줄바꿈 
             *  \s : 문자간의 띄어쓰기
             *  \" \" : 문자 안에 "", ''넣기
             */
            System.out.println("성명\t주소\t전화번호");
            System.out.println("성명\n주소\n전화번호");
            System.out.println("성명\s주소\s전화번호");
            System.out.println("\"주소\"");
            System.out.println("\'주소\'");
            System.out.println("재미있는\\자바");
            System.out.println("\n");
            System.out.println("escape문자");

            // 화면 출력
            System.out.print("테스트"); 
            System.out.print("테스트"); //
            System.out.println("2");//자동 줄바꿈
            System.out.printf("3");
        }
}
