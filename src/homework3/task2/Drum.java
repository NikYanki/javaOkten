package homework3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Drum implements Instrument {
    private int size;

    @Override
    public void play() {
        System.out.println(this.toString());
    }
}
