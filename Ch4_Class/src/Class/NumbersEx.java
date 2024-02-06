package Class;

public class NumbersEx {

  public static void main(String[] args) {
    int nums[] = { 76, 85, 78, 25, 87, 99, 87 };
    Numbers numbers = new Numbers(nums);

    System.out.println(numbers.getTotal());
    System.out.println(numbers.getAverage());
  }
}
