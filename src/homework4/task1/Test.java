package homework4.task1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        User u1 = new User(19,1,"Volodya","Yablockin","fweifnwe@wr.fw");
        User u2 = new User(20,2,"Max","Abrikosov","ehraartgs@wr.fw");
        User u3 = new User(21,3,"Miha","Chereshnya","araberaeb@wr.fw");
        User u4 = new User(22,4,"Damian","Gruska","igmfnb@wr.fw");
        User u5 = new User(23,5,"Kostya","Persikov","fafbvwe@wr.fw");
        User u6 = new User(24,6,"Andrey","Apelsin","gcaoufon@wr.fw");
        User u7 = new User(25,7,"Pawel","Ananas","dg548jghs@wr.fw");
        User u8 = new User(26,8,"Bogdan","Orehov","avnsvso@wr.fw");
        User u9 = new User(27,9,"Vladislaw","Wyshneveckij","dbgot58bf.fw");
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);
        users.add(u6);
        users.add(u7);
        users.add(u8);
        users.add(u9);
        users.sort((o1, o2) -> o2.getAge()- o1.getAge());
        System.out.println(users.toString());
        System.out.println();
        users.sort((o1, o2) -> o1.getAge()- o2.getAge());
        System.out.println(users.toString());
        System.out.println();
        users.sort((o1, o2) -> o1.getName().length()-o2.getName().length());
        System.out.println(users.toString());
        System.out.println();
        users.sort((o1, o2) -> o2.getName().length()-o1.getName().length());
        System.out.println(users.toString());
    }

}
