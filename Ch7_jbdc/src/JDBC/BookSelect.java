package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookSelect {

  public static void main(String[] args)
    throws ClassNotFoundException, SQLException {
    Connection con = null;

    PreparedStatement pstmt = null;
    ResultSet rs = null; // select 때만 사용

    try {
      // 1. 드라이버 로드
      Class.forName("oracle.jdbc.OracleDriver");

      // 2. 커넥션 얻기
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String user = "c##test2";
      String password = "test";

      con = DriverManager.getConnection(url, user, password);

      //   3. sql 작성

      String sql = "SELECT * FROM  BOOKTBL";
      // 4. 전송
      pstmt = con.prepareStatement(sql);
      // 5. 실행
      rs = pstmt.executeQuery();
      // resultSet : sql 실행 결과가 담긴 객체(테이블 모양)
      // rs.next() : true 일떄 읽어올 결과가 있음
      // rs.getString(컬럼번호) : 가저올 컬럼 테이터가 varchar2(nvarchar2)
      // rs.getString(컬럼명) :
      // rs.getInt(컬럼번호) or rs.getInt(컬럼명)  : 가저올 컬럼 데이터가 number

      while (rs.next()) {
        int code = rs.getInt(1);
        String title = rs.getString(2);
        String Writer = rs.getString(3);
        int price = rs.getInt(4);
        System.out.printf(
          "|CODE : %d   | TITLE : %s   | WRITER : %s   | PRICE : %d\n",
          code,
          title,
          Writer,
          price
        );
      }
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
        if (con != null) {
          con.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
