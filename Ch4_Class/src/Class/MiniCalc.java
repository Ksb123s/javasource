package Class;

public class MiniCalc {

  int pluse(int x, int y) {
    return x + y;
  }

  double avg(int x, int y) {
    int sum = pluse(x, y);
    return (double) sum / 2;
  }

  void execute() {
    println("실행결과 : " + avg(7, 10));
  }

  void println(String meseege) {
    System.out.println(meseege);
  }
}
