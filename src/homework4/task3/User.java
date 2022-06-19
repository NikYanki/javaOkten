package homework4.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User implements Comparable<User>{
    int id;
    String name;
    String surname;
    String email;
    int age;
    Gender gender;
    ArrayList<Skil> skills;
    Car car;

    @Override
    public int compareTo(User o) {
        return this.skills.size()-o.skills.size();
    }
}
