package homework4.task2;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> anOldStory = new ArrayList<>();
        anOldStory.add("Strange that I did not know him then,");
        anOldStory.add("That friend of mine!");
        anOldStory.add("I did not even show him then");
        anOldStory.add("One friendly sign;");
        anOldStory.add("But cursed him for the ways he had");
        anOldStory.add("To make me see");
        anOldStory.add("My envy of the praise he had");
        anOldStory.add("For praising me.");
        anOldStory.add("I would have rid the earth of him");
        anOldStory.add("Once, in my pride!...");
        anOldStory.add("I never knew the worth of him");
        anOldStory.add("Until he died.");
        System.out.println(anOldStory.toString());
        System.out.println();
        Collections.sort(anOldStory);
        System.out.println(anOldStory.toString());
    }
}
