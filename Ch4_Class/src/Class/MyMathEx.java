package Class;

public class MyMathEx {

  public static void main(String[] args) {
    MyMath math = new MyMath(15l, 5l);

    System.out.println("add() :" + math.add());
    System.out.println("sub() :" + math.substruct());
    System.out.println("mult() :" + math.multiply());
    System.out.println("div() :" + math.divide());

    System.out.println("static add() :" + MyMath.add(100l, 200l));
    System.out.println("static sub() :" + MyMath.substruct(100l, 200l));
    System.out.println("static mult() :" + MyMath.multiply(100l, 200l));
    System.out.println("static div() :" + MyMath.divide(100l, 200l));
  }
}
