package Class;

public class PersonEx {

  public static void main(String[] args) {
    Person person = new Person();
    person.setName("홍길동");
    System.out.println(person.getName());

    Person person2 = new Person();
    person2.setName("성춘향");

    System.out.println(person2.getName());
    System.out.println(person);
  }
}
