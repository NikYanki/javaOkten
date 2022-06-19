package homework3.task2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Instrument> instruments = new ArrayList<>();
        Guitar guitar = new Guitar(6,GuitarType.BASS);
        instruments.add(guitar);
        Trumpet trumpet = new Trumpet(5.5);
        instruments.add(trumpet);
        Drum drum = new Drum(20);
        instruments.add(drum);
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
