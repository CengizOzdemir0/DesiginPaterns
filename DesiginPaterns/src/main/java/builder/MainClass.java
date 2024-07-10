package builder;

public class MainClass {

  public static void main(String[] args) {
    User eyyup = new User.UserBuilder("Cengiz", "Özdemir")
        .age(26)
        .phone("+90 222 222 22 22")
        .address("Çankaya/Ankara")
        .build();

    User kevser = new User.UserBuilder("Ahmet", "Köse")
        .age(22)
        .phone("+90 216 222 33333")
        .build();

    User merve = new User.UserBuilder("Kasım", "Topal")
        .age(22)
        .phone("2323232232332")
        .build();

    System.out.println(eyyup);
    System.out.println(kevser);
    System.out.println(merve);
  }

}
