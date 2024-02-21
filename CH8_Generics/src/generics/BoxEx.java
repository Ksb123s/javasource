package generics;

// T OR E  : 객체

public class BoxEx {

  public static void main(String[] args) {
    Box box = new Box();

    box.setItem(new String("홍길동"));

    String name = (String) box.getItem();
    box.setItem(Integer.valueOf(1234));
    Integer i = (Integer) box.getItem();
    box.setItem(Float.valueOf(3.1415f));
    Float f = (Float) box.getItem();

    Box2<String> box2 = new Box2<>();
    Box2<Integer> box3 = new Box2<>();
    Box2<Float> box4 = new Box2<>();
    Box2<Double> box5 = new Box2<>();

    box2.setItem("홍길동");
    box2.setItem("김유신");
    String str = box2.getItem();

    Box3<Fruit> fruitBox = new Box3<>();
    Box3<Apple> appleBox = new Box3<>();
    Box3<Grape> grapeBox = new Box3<>();
    Box3<Toy> toyBox = new Box3<>();

    // 부모 타입으로 설정 시 자식 객체 담는 것 허용
    fruitBox.add(new Fruit());
    fruitBox.add(new Apple());
    fruitBox.add(new Grape());
    // fruitBox.add(new Toy());

    appleBox.add(new Apple());
    // appleBox.add(new Grape()); 불가

    grapeBox.add(new Grape());

    FruitBox<Fruit> fruitBox2 = new FruitBox<>();

    fruitBox2.add(new Fruit());
    fruitBox2.add(new Apple());
    fruitBox2.add(new Grape());
    // fruitBox2.add(new Toy());

    System.out.println(Juicer.makeJuice(fruitBox2));
  }
}
