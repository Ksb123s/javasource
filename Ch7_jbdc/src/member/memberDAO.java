package member;

import static member.jdbcUtil.*;

import BOOK.BookDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class memberDAO {

  private Connection con;
  private PreparedStatement pstmt;
  private ResultSet rs;

  private memberDTO memberDTO;

  public int insert(memberDTO dto) {
    con = getConnection();
    int result = 0;
    String sql = "INSERT INTO MEMBERTBL (USERID,PASSWORD,NAME,EMAIL) ";
    sql += "VALUES(?, ?, ?, ?)";

    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, dto.getUserid());
      pstmt.setString(2, dto.getPassword());
      pstmt.setString(3, dto.getName());
      pstmt.setString(4, dto.getEmail());
      result = pstmt.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }

    return result;
  }

  //   public memberDTO getRow(memberDTO dto) {
  //     con = getConnection();
  //     String sql = "SELECT * FROM memberTBL WHERE USERID = ? AND PASSWORD = ?";

  //     try {
  //       pstmt = con.prepareStatement(sql);
  //       pstmt.setString(1, dto.getUserid());
  //       pstmt.setString(2, dto.getPassword());

  //       rs = pstmt.executeQuery();
  //       if (rs.next()) {
  //         memberDTO = new memberDTO();
  //         memberDTO.setUserid(rs.getString("userid"));
  //         memberDTO.setPassword(rs.getString("password"));
  //         memberDTO.setName(rs.getString("name"));
  //         memberDTO.setEmail(rs.getString("email"));
  //       }
  //     } catch (SQLException e) {
  //       e.printStackTrace();
  //     } finally {
  //       close(con, pstmt, rs);
  //     }
  //     return memberDTO;
  //   }

  public memberDTO getRow(String uid, String pwd) {
    con = getConnection();
    String sql = "SELECT * FROM memberTBL WHERE USERID = ? AND PASSWORD = ?";

    try {
      pstmt = con.prepareStatement(sql);
      //   java.sql.SQLException: ORA-17003: 열 인덱스가 부적합합니다.
      pstmt.setString(1, uid);
      pstmt.setString(2, pwd);

      rs = pstmt.executeQuery();
      if (rs.next()) {
        memberDTO = new memberDTO();
        memberDTO.setUserid(rs.getString("userid"));
        memberDTO.setPassword(rs.getString("password"));
        memberDTO.setName(rs.getString("name"));
        memberDTO.setEmail(rs.getString("email"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }
    return memberDTO;
  }

  //   메소드 작성
  //   - 실행할 sql 구문 작성
  //      insert, update ,delete = > executeUpdate()
  //      select => executeQuery()
  // -결과가 1개면 ~~dto
  // -결과가 2개이면 list<~dto>
  public List<memberDTO> getRows() {
    con = getConnection();
    // java.sql.SQLSyntaxErrorException: ORA-00933: SQL 명령어가 올바르게 종료되지 않았습니다
    String sql = "SELECT * ";
    sql += "FROM memberTBL";
    List<memberDTO> list = new ArrayList<>();
    try {
      pstmt = con.prepareStatement(sql);

      rs = pstmt.executeQuery();
      while (rs.next()) {
        memberDTO = new memberDTO();
        memberDTO.setUserid(rs.getString("userid"));
        memberDTO.setPassword(rs.getString("password"));
        memberDTO.setName(rs.getString("name"));
        memberDTO.setEmail(rs.getString("email"));
        list.add(memberDTO);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }
    return list;
  }

  public int update(String uid, String pwd) {
    con = getConnection();
    int result = 0;
    String sql = "UPDATE MEMBERTBL SET PASSWORD = ? WHERE USERID = ? ";

    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, pwd);
      pstmt.setString(2, uid);

      result = pstmt.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }
    return result;
  }

  public int delete(String id) {
    con = getConnection();
    int result = 0;
    String sql = "DELETE FROM MEMBERTBL WHERE USERID = ?";

    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, id);
      result = pstmt.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }
    return result;
  }
}
