package Class;

public class Singleton {

  // singleton 패턴
  // 단 하나의 객체만을 생성할 수 있도록 하는 패턴
  private static Singleton singleton;

  private Singleton() {}

  static Singleton getInstance() {
    if (singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }
}
