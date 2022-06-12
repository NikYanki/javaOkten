package homework2.task3;

import lombok.NoArgsConstructor;

@NoArgsConstructor
class Papyrus {
    void page() {
        System.out.println("сторінка виготовлена з очерету");
    }

    void appearance() {
        System.out.println("має вигляд сувою");
    }

    void manufacturing() {
        System.out.println("ручне");
    }
}

@NoArgsConstructor
class Book extends Papyrus {
    void page() {
        System.out.println("сторінка виготовлена з целюлози");
    }

    void appearance() {
        System.out.println("має вигляд зшитої стопки аркушів");
    }

    void manufacturing() {
        System.out.println("машинне");
    }
}

@NoArgsConstructor
class Comics extends Book {
    void whatIs() {
        System.out.println("ілюстровані історії");
    }

}

@NoArgsConstructor
class Magazine extends Book {
    void whatIs() {
        System.out.println("інтервю, обзори, новини");
    }
}

public class Test {
    public static void main(String[] args) {
        Papyrus papyrus = new Papyrus();
        Book book = new Book();
        Magazine magazine = new Magazine();
        Comics comics = new Comics();

        papyrus.appearance();
        papyrus.page();
        papyrus.manufacturing();
        System.out.println();
        book.appearance();
        book.manufacturing();
        book.page();
        System.out.println();
        magazine.whatIs();
        magazine.appearance();
        magazine.manufacturing();
        magazine.page();
        System.out.println();
        comics.whatIs();
        comics.appearance();
        comics.manufacturing();
        comics.page();
    }
}
