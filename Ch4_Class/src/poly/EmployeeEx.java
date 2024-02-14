package poly;

public class EmployeeEx {

  public static void main(String[] args) {
    Employee employee = new Employee("홍길동", "사원");
    work(employee);
    employee.work();

    // employee = new Ceo("김유신", "회장");
    // employee.work();
    Ceo ceo = new Ceo("김유신", "회장");
    work(ceo);

    // employee = new Admin("김동호", "관리자");
    // employee.work();
    Admin admin = new Admin("김동호", "관리자");
    work(admin);

    // employee = new PartTime("정우성", "알바");
    // employee.work();
    PartTime partTime = new PartTime("정우성", "알바");
    work(partTime);
  }

  public static void work(Employee employee) {
    employee.work();
  }
}
