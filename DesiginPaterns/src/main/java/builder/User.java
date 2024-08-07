package builder;

public class User {

  private final String firstName;
  private final String surname;
  private final int age;
  private final String phone;
  private final String address;

  public User(UserBuilder userBuilder) {
    this.firstName = userBuilder.firstName;
    this.surname = userBuilder.surname;
    this.age = userBuilder.age;
    this.phone = userBuilder.phone;
    this.address = userBuilder.address;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getSurname() {
    return surname;
  }

  public int getAge() {
    return age;
  }

  public String getPhone() {
    return phone;
  }

  public String getAddress() {
    return address;
  }

  @Override
  public String toString() {
    return "User: " + this.firstName + ", " + this.surname + ", " + this.age + ", " + this.phone + ", " + this.address;
  }

  /**
   *
   * @author Cengiz Özdemir
   *
   */
  public static class UserBuilder {

    private final String firstName;
    private final String surname;
    private int age;
    private String phone;
    private String address;

    public UserBuilder(String firstName, String surname) {
      this.firstName = firstName;
      this.surname = surname;
    }

    public UserBuilder age(int age) {
      this.age = age;
      return this;
    }

    public UserBuilder phone(String phone) {
      this.phone = phone;
      return this;
    }

    public UserBuilder address(String address) {
      this.address = address;
      return this;
    }

    public User build() {
      User user = new User(this);
      return user;
    }
  }
}
