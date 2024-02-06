package Exam;

public class Triangle {

  private int baseLine;
  private int height;

  public Triangle(int baseLine, int height) {
    this.baseLine = baseLine;
    this.height = height;
  }

  double getArea() {
    return ((double) this.baseLine * (double) this.height) / 2;
  }
}
