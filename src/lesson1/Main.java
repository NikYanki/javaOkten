package lesson1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User(18, 1111, "Valera", "Yablockin", "", "", 2100.50);
        System.out.println(user2.toString());
    }
}
@NoArgsConstructor
@AllArgsConstructor
class User {
    //    public User() {
//    }

    int age;
    int id;
    String name;
    String surname;
    String email;
    String department;
    double sallary;
    //private int pin;

//    public int getPin() {
//        return pin;
//    }
//
//    public void setPin(int pin) {
//        this.pin = pin;
//    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", sallary=" + sallary +
        //", pin=" + pin +
                '}';
    }

//    public User(int age, int id, String name, String surname, String email, String department, double sallary) {
//        this.age = age;
//        this.id = id;
//        this.name = name;
//        this.surname = surname;
//        this.email = email;
//        this.department = department;
//        this.sallary = sallary;
//    }

}
