package homework3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Guitar implements Instrument {
    boolean isAcoustic(GuitarType type) {
        return type == GuitarType.ACOUSTIC;
    }

    boolean isBass(GuitarType type) {
        return type == GuitarType.BASS;
    }

    boolean isElectro(GuitarType type) {
        return type == GuitarType.ELECTRO;
    }

    private int numberOfStrings;
    GuitarType type;

    public void play() {
        System.out.println(this.toString());
    }
}
