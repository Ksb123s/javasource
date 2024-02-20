package member;

import BOOK.BookDAO;
import BOOK.BookDTO;
import java.util.List;
import java.util.Scanner;

public class memberMain {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean run = true;
    memberDAO memberDAO = new memberDAO();
    memberDTO dto = null;

    while (run) {
      System.out.println("===================================");
      System.out.println("1. 전체 회원 조회");
      System.out.println("2. 개별 회원 조회");
      System.out.println("3. 회원 추가");
      System.out.println("4. 회원 정보 수정");
      System.out.println("5. 회원 삭제");
      System.out.println("6. 종료");
      System.out.println("===================================");

      System.out.println("메뉴 입력 >>>>");
      int menu = Integer.parseInt(sc.nextLine());
      switch (menu) {
        case 1:
          System.out.println("\n **** 전체 회원 조회 **** ");
          List<memberDTO> list = memberDAO.getRows();
          for (memberDTO memberDTO : list) {
            System.out.println(memberDTO);
          }
          break;
        case 2:
          System.out.println("\n **** 회원 조회 **** ");
          System.out.println("id >>>");
          String Fid = sc.nextLine();
          System.out.println("password >>>");
          String Fpassword = sc.nextLine();
          //   dto = new memberDTO();
          //   dto.setUserid(Fid);
          //   dto.setPassword(Fpassword);
          memberDTO dto2 = memberDAO.getRow(Fid, Fpassword);
          System.out.println("======= 죄회 회원 정보 =======");
          System.out.println(dto2);
          System.out.println();
          break;
        case 3:
          System.out.println("\n **** 회원 추가 **** ");
          System.out.println("id >>>");
          String newId = sc.nextLine();
          System.out.println("password >>>");
          String newPassword = sc.nextLine();
          System.out.println("name >>>");
          String newName = sc.nextLine();
          System.out.println("email >>>");
          String newEmail = sc.nextLine();
          dto = new memberDTO(newId, newPassword, newName, newEmail);

          System.out.println(
            memberDAO.insert(dto) > 0 ? "입력 성공 " : "입력 실패"
          );

          break;
        case 4:
          System.out.println("\n **** 회원 정보 수정 **** ");
          System.out.println("id >>>");
          String Id = sc.nextLine();
          System.out.println("before password >>>");
          String beforePassword = sc.nextLine();
          //   기존 회원이 존재시 변경
          if (memberDAO.getRow(Id, beforePassword) != null) {
            System.out.println("change password >>>");
            String changPassword = sc.nextLine();

            System.out.println(
              memberDAO.update(Id, changPassword) > 0
                ? "수정 성공"
                : "수정 실패"
            );
          } else {
            System.out.println("회원 정보가 일치하지 않습니다.");
          }

          break;
        case 5:
          System.out.println("\n **** 회원 삭제 **** ");
          System.out.println("id >>>");
          String deletId = sc.nextLine();
          System.out.println("password >>>");
          String comparePassword = sc.nextLine();

          if (memberDAO.getRow(deletId, comparePassword) != null) {
            System.out.println(
              memberDAO.delete(deletId) > 0
                ? "회원 삭제 성공"
                : "회원 삭제 실패"
            );
          } else {
            System.out.println("회원이 존재하지 않습니다.");
          }

          break;
        case 6:
          run = false;
          break;
        default:
          break;
      }
    }
  }
}
