package member;

public class memberDTO {

  private String userId;
  private String password;
  private String name;
  private String email;

  public String getUserid() {
    return userId;
  }

  public void setUserid(String userid) {
    this.userId = userid;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public memberDTO() {}

  public memberDTO(String userid, String password, String name, String email) {
    this.userId = userid;
    this.password = password;
    this.name = name;
    this.email = email;
  }

  @Override
  public String toString() {
    return (
      "memberDTO [userid=" +
      userId +
      ", password=" +
      password +
      ", name=" +
      name +
      ", email=" +
      email +
      "]"
    );
  }
}
