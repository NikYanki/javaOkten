package homework2.task4;

import java.util.Arrays;

class Skil {
    Skil() {
    }

    String title;
    int exp;

    Skil(String title, int exp) {
        this.title = title;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Skil{" +
                "title='" + title + '\'' +
                ", exp=" + exp +
                '}';
    }
}

class Car {
    Car() {
    }

    String model;
    int year;
    int power;

    Car(String model, int year, int power) {
        this.model = model;
        this.year = year;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", power=" + power +
                '}';
    }
}

enum Gender {
    MALE, FEMALE
}

class User {
    User() {
    }

    int id;
    String name;
    String surname;
    String email;
    int age;
    Gender gender;
    Skil[] skills;
    Car car;

    public User(int id, String name, String surname, String email, int age, Gender gender, Car car, Skil... skills) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.car = car;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", skills=" + Arrays.toString(skills) +
                ", car=" + car +
                '}';
    }
}

public class Test {
    public static void main(String[] args) {
        User user = new User(1, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE,
                new Car("toyota", 2021, 250), new Skil("java", 10), new Skil("js", 10),
                new Skil("c++", 10));
    System.out.println(user.toString());
    }
}
