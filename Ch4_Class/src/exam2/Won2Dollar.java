package exam2;

public class Won2Dollar extends Convert {

  @Override
  protected double convert(double src) {
    return src / ratio;
  }

  @Override
  protected String getSrcString() {
    return "원";
  }

  @Override
  protected String getDestString() {
    return "$";
  }
}
