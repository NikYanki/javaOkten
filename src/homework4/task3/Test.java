package homework4.task3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        ArrayList<Skil> skils = new ArrayList<>();
        skils.add(new Skil("java", 10));
        skils.add(new Skil("js", 10));
        skils.add(new Skil("c++", 10));

        User u1 = new User(1, "Volodya", "Yablockin", "fweifnwe@wr.fw", 19, Gender.MALE, skils, new Car("toyota", 2001, 110));

        User u2 = new User(2, "Max", "Abrikosov", "ehraartgs@wr.fw", 22, Gender.MALE, new ArrayList<Skil>(), new Car("bmw", 2010, 210));
        u2.skills.add(new Skil("pyton", 10));

        User u3 = new User(3, "Jullia", "Chereshnya", "araberaeb@wr.fw", 27, Gender.FEMALE, new ArrayList<Skil>(), new Car("hyundai", 2007, 143));
        u3.skills.add(new Skil("ruby", 10));
        u3.skills.add(new Skil("php", 10));
        u3.skills.add(new Skil("html", 10));
        u3.skills.add(new Skil("c#", 10));

        User u4 = new User(4, "Damian", "Gruska", "igmfnb@wr.fw", 24, Gender.MALE, new ArrayList<Skil>(), new Car("opel", 2011, 95));
        u4.skills.add(new Skil("html", 10));
        u4.skills.add(new Skil("c#", 10));

        User u5 = new User(5, "Kostya", "Persikov", "fafbvwe@wr.fw", 22, Gender.MALE, new ArrayList<Skil>(), new Car("volvo", 2005, 115));
        u5.skills.add(new Skil("html", 10));
        u5.skills.add(new Skil("c#", 10));

        User u6 = new User(6, "Andrey", "Apelsin", "gcaoufon@wr.fw", 23, Gender.MALE, skils, new Car("zaz", 85, 2008));
        u6.skills.add(new Skil("html", 10));

        User u7 = new User(7, "Anna", "Ananas", "dg548jghs@wr.fw", 39, Gender.FEMALE, skils, new Car("fiat", 2015, 100));

        User u8 = new User(8, "Bogdan", "Orehov", "avnsvso@wr.fw", 24, Gender.MALE, new ArrayList<Skil>(), new Car("luaz", 2000, 70));
        u8.skills.add(new Skil("html", 10));

        User u9 = new User(9, "Vladislaw", "Wyshneveckij", "dbgot58bf.fw", 33, Gender.MALE, skils, new Car("honda", 2010, 152));

        User u10 = new User(10, "Bogdan", "Orehov", "avnsvso@wr.fw", 28, Gender.MALE, skils, new Car("mazda", 2013, 134));

        HashSet<User> users = new HashSet<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);
        users.add(u6);
        users.add(u7);
        users.add(u8);
        users.add(u9);
        users.add(u10);
        System.out.println(users.toString());
        users.removeIf(next -> next.gender == Gender.MALE);
        System.out.println();
        System.out.println(users.toString());
        System.out.println();

        TreeSet<User> usersT = new TreeSet<>();
        usersT.add(u1);
        usersT.add(u2);
        usersT.add(u3);
        usersT.add(u4);
        usersT.add(u5);
        usersT.add(u6);
        usersT.add(u7);
        usersT.add(u8);
        usersT.add(u9);
        usersT.add(u10);
        System.out.println(usersT);
        System.out.println();

    }
}
