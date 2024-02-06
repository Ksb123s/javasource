package Class;

public class StudentEx2 {

  public static void main(String[] args) {
    // 객체(instance ) 생성
    Student student = new Student();
    System.out.println(student);
    System.out.println(student.id);
    System.out.println(student.addr);
    System.out.println(student.hp);
    System.out.println(student.name);

    student.id = "202412121";
    student.name = "홍길동";
    student.addr = "서울시 종로구";
    student.hp = "010-1234-5678";

    Student student2 = new Student();

    student2.id = "20241013";
    student2.name = "성춘향";
    student2.addr = "구로구 궁둥";
    student2.hp = "010-4321-5678";
    Student2 obj2 = new Student2();

    obj2.setId("20217860");
    obj2.setName("박지성");
    obj2.setAddr("경기도 성남시");
    obj2.setHp("010-2071-6465");
    System.out.println(obj2);
  }
}
