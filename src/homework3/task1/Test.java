package homework3.task1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Printable> library = new ArrayList<>();
        Printable book =new Book(100,24.99);
        Printable magazine = new Magazine(Genres.NEWS, 20);
        library.add(book);
        library.add(magazine);
        for (Printable printable : library) {
            printable.print();
            System.out.println(printable.toString());
        }
    }
}
