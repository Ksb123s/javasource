package poly;

public class CarEx {

  public static void main(String[] args) {
    Car car = null;

    FireEngine fireEngine = new FireEngine();
    FireEngine fireEngine2 = null;

    Ambulance ambulance = null;
    // ambulance =fireEngine; 상속관계 x 강제 형변환 불가

    fireEngine.water();
    car = fireEngine; // Car car = new FireEngine();

    // 강제 형변환
    fireEngine2 = (FireEngine) car;
    fireEngine2.water();

    Car car2 = new Car();
    //ClassCastException
    // FireEngine fe3 = (FireEngine) car2;
    // fe3.water();
  }
}
