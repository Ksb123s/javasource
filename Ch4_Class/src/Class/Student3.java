package Class;

public class Student3 {

  private String id;
  private String name;
  private int Kor;
  private int eng;
  private int Math;

  @Override
  public String toString() {
    return (
      "Student3 [id=" +
      id +
      ", name=" +
      name +
      ", Kor=" +
      Kor +
      ", eng=" +
      eng +
      ", Math=" +
      Math +
      "]"
    );
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getKor() {
    return Kor;
  }

  public void setKor(int kor) {
    Kor = kor;
  }

  public int getEng() {
    return eng;
  }

  public void setEng(int eng) {
    this.eng = eng;
  }

  public int getMath() {
    return Math;
  }

  public void setMath(int math) {
    Math = math;
  }
}
