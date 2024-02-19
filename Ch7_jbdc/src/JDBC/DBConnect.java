package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
    JDBC(Java Data Base Connectivity)
     - 자바에서 데이터 베이스 접속할 수 있도록 제공 
     - 자바와 DB를 연동하는 드라이버 필요 => DB에 따라 다른 드라이버 필요
     - C:\Users\soldesk\AppData\Roaming\DBeaverData\drivers\maven\maven-central\com.oracle.database.jdbc
     - ojdbc11.jar(jar : 클래스 압축 )
 

     java.sql.Connection
 */

public class DBConnect {

  public static void main(String[] args)
    throws ClassNotFoundException, SQLException {
    Connection con = null;

    PreparedStatement pstmt = null;

    try {
      // 오라클 드라이버 로드
      Class.forName("oracle.jdbc.OracleDriver");
      // jdbc:oracle:thin:@[Hostname]:[port]/[DB service name]
      // Hostname == 내컴퓨터
      // DB 서버가 다른 곳에 있다면 db서버 ip 주소 기입
      // portN : 1521(기본) , 변동가능
      // 오라클 Express Edition 버전 서비스 이름 : xe
      // 다른 버전 설치시 orcl
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String user = "c##test2";
      String password = "test";

      // 실제 Connection 정보 가져오기
      con = DriverManager.getConnection(url, user, password);

      System.out.println("연결되었습니다.");
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }
}
