package homework2.task1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
/*створити клас, який би описував подібні об'єкти
https://jsonplaceholder.typicode.com/users/1*/

@NoArgsConstructor
@AllArgsConstructor
@ToString
class Geo {
    String lat;
    String lng;
}

@NoArgsConstructor
@AllArgsConstructor
@ToString
class Address {
    String street;
    String suite;
    String city;
    String zipcode;
    Geo geo;
}

@NoArgsConstructor
@AllArgsConstructor
@ToString
class Company {
    String name;
    String catchPhrase;
    String bs;
}

@NoArgsConstructor
@AllArgsConstructor
@ToString
class User {
    int id;
    String name;
    String username;
    String email;
    Address address;
    String phone;
    String website;
    Company company;
}

public class UserCreator {
    public static void main(String[] args) {
        User user = new User(1, "Leanne Graham", "Bret", "Sincere@april.biz", new Address("Kulas Light", "Apt. 556",
                "Gwenborough", "92998-3874", new Geo("-37.3159", "81.1496")), "1-770-736-8031 x56442",
                "hildegard.org", new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets"));
    System.out.println(user.toString());
    }
}
