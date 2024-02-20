package BOOK;

import java.util.List;
import java.util.Scanner;

public class BookMain {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean run = true;
    BookDAO DAO = new BookDAO();
    while (run) {
      System.out.println("===================================");
      System.out.println("1. 특정 도서 조회");
      System.out.println("2. 전체 도서 조회");
      System.out.println("3. 도서 입력");
      System.out.println("4. 도서 정보 수정");
      System.out.println("5. 도서 삭제");
      System.out.println("6. 종료");
      System.out.println("===================================");

      System.out.println("메뉴 입력 >>>>");
      int menu = Integer.parseInt(sc.nextLine());
      switch (menu) {
        case 1:
          // 1. 특정 도서 조회(코드)
          System.out.println("code 입력");
          int code = Integer.parseInt(sc.nextLine());
          BookDTO dto = DAO.getRow(code);
          System.out.println(dto);
          break;
        case 2:
          // 2. 전체 조회
          List<BookDTO> list = DAO.getRows();
          for (BookDTO bookDTO : list) {
            System.out.println(bookDTO);
          }
          break;
        case 3:
          System.out.println(" code >>>");
          int newCode = Integer.parseInt(sc.nextLine());
          System.out.println(" title >>>");
          String newtitle = sc.nextLine();
          System.out.println("writer >>>");
          String newWriter = sc.nextLine();
          System.out.println("price >>>");
          int newPrice = Integer.parseInt(sc.nextLine());
          BookDTO insertDto = new BookDTO(
            newCode,
            newtitle,
            newWriter,
            newPrice
          );
          int result = DAO.insert(insertDto);
          System.out.println(result > 0 ? "입력 성공" : "입력 실패");
          break;
        case 4:
          System.out.println(" code >>>");
          int updateCode = Integer.parseInt(sc.nextLine());
          System.out.println("price >>>");
          int updatePrice = Integer.parseInt(sc.nextLine());
          BookDTO updaDto = new BookDTO();
          updaDto.setCode(updateCode);
          updaDto.setPrice(updatePrice);
          System.out.println(
            DAO.update(updaDto) > 0 ? "수정 성공" : "수정 실패"
          );
          break;
        case 5:
          System.out.println(" code >>>");
          int deleteCode = Integer.parseInt(sc.nextLine());
          System.out.println(
            DAO.delete(deleteCode) > 0 ? "삭제 성공" : "삭제 실패"
          );
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
