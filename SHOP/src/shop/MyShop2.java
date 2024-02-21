package shop;

import java.util.Scanner;

public class MyShop2 implements IShop {

  // 배열 데이터 저장
  Scanner sc = new Scanner(System.in);
  private int count = 0;
  private String cNo;
  private Customer customers[] = new Customer[5];
  private Product products[] = new Product[5];
  private String title;

  //   장바구니
  private Product carts[] = new Product[5]; //cellPhone 고 ㅏ samartTv둘다 담아야하기에

  @Override
  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public void genUser() {
    // 고객 생성
    // customer[0] = new Customer("홍길동", PayType.CARD);
    // customer[1] = new Customer("강동원", PayType.CASH);
    // customer[2] = new Customer("김길동", PayType.CARD);
    // customer[3] = new Customer("이춘화", PayType.CASH);
    // customer[4] = new Customer("홍길명", PayType.CASH);
    Customer customer = new Customer();
    customer.setName("홍길동");
    customer.setPayType(PayType.CARD);
    customers[0] = customer;
    Customer customer2 = new Customer();
    customer2.setName("강동원");
    customer2.setPayType(PayType.CASH);
    customers[1] = customer2;
    Customer customer3 = new Customer();
    customer3.setName("김길동");
    customer3.setPayType(PayType.CARD);
    customers[2] = customer3;
    Customer customer4 = new Customer();
    customer4.setName("이춘화");
    customer4.setPayType(PayType.CASH);
    customers[3] = customer4;
    Customer customer5 = new Customer();
    customer5.setName("홍길면");
    customer5.setPayType(PayType.CARD);
    customers[4] = customer5;
  }

  @Override
  public void genProduct() {
    CellPhone phone = new CellPhone(100000, "겔럭시 노트 10+", "U+");
    products[0] = phone;
    phone = new CellPhone(5000000, "겔럭시 z 플립", "Kt");
    products[1] = phone;
    phone = new CellPhone(8000000, "겔럭시 s20", "U+");
    products[2] = phone;
    SmartTV smartTV = new SmartTV(90000000, "OLED", "240HZ");
    products[3] = smartTV;
    smartTV = new SmartTV(2000000, "SmartOLED", "240Hz");
    products[4] = smartTV;
  }

  @Override
  public void Start() {
    boolean State = true;
    System.out.println(this.title + ": 메인화면 - 계정 선택");
    System.out.println("------------------------------");
    for (int i = 0; i < customers.length; i++) {
      System.out.println(
        i + customers[i].getName() + "(" + customers[i].getPayType() + ")"
      );
    }
    System.out.println("[x] 종료");
    // 고객번호 입력 받기
    System.out.println(" 고객번호 입력");
    cNo = sc.nextLine();
    if (cNo.equals("x")) {
      System.exit(0);
    } else {
      System.out.println("###" + cNo + "고객선택 ###");
      productList();
    }
  }

  public void productList() {
    System.out.println(this.title + ": 상품목록 - 상품선택");
    System.out.println("------------------------------");
    for (int i = 0; i < products.length; i++) {
      System.out.print("[" + i + "]");
      products[i].PrintDetail();
    }
    System.out.println("[h] 메인화면");
    System.out.println("[c] 체크아웃");

    System.out.println(" 상품번호 입력");
    String menu = sc.nextLine();

    switch (menu) {
      case "h":
        count = 0;
        Start();
        break;
      case "c":
        CheckOut();
        break;
      default: // 0~4에 해당하는 제품을 장바구니에 추가
        try {
          carts[count] = products[Integer.parseInt(menu)];
          count++;
          productList();
          break;
        } catch (Exception e) {
          System.out.println(" 담을수 있는 최대 수량을 초과하셨습니다.");
          productList();
        }
    }
  }

  public void CheckOut() {
    int result = 0;
    int i = 0;
    System.out.println(this.title + ": 체크아웃");
    System.out.println("-----------------------------------");
    for (Product product : carts) {
      if (product != null) {
        System.out.println(
          "[" +
          i +
          "]" +
          "제품 : " +
          product.getModelName() +
          "가격 : " +
          product.getPrice()
        );
        result += product.getPrice();
        i++;
      }
    }
    System.out.println("-----------------------------------");
    System.out.println("결제 금액 : " + result + "원");
    System.out.println(
      "결제 방법 : " + customers[Integer.parseInt(cNo)].getPayType()
    );
    System.out.println("[p] 이전");
    System.out.println("[q] 결제");

    System.out.println("메뉴를 선택 하세요");
    String menu = sc.nextLine();

    switch (menu) {
      case "p":
        productList();
        break;
      case "q":
        System.out.println("결제가 완료 되었습니다. ");
        System.exit(0);
        break;
      default:
        break;
    }
  }
}
