package homework2.task2;

import lombok.NoArgsConstructor;

abstract class PC {
    protected abstract void processor();

    public abstract void monitor();
}

interface IBattarey {
    void battary();
}

@NoArgsConstructor
class Laptop extends PC implements IBattarey {
    public void processor() {
        System.out.println("процессор збалансований між економією енергії та продуктивністью");
    }

    public void monitor() {
        System.out.println("монітор доволі тонкий та являється нерозбірною кришкою лаптопа");
    }

    public void battary() {
        System.out.println("має досить потужну батарею");
    }

}

@NoArgsConstructor
class Workstation extends PC {
    public void processor() {
        System.out.println("часто має топові по продуктивності рішення");
    }

    public void monitor() {
        System.out.println("зазвичай має великий окремий монітор");
    }
}

@NoArgsConstructor
class UltraBook extends PC implements IBattarey {
    public void processor() {
        System.out.println("процессор спрямований більше на енергозбереження");
    }

    public void monitor() {
        System.out.println("монітор являється нерозбірною кришкою лаптопа, ствотений в найтоншій репрезентації");
    }

    public void battary() {
        System.out.println("має компактну інтегровану батарею");
    }
}

public class Test {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        UltraBook ultraBook = new UltraBook();
        Workstation workstation = new Workstation();
        laptop.battary();
        laptop.monitor();
        laptop.processor();
        System.out.println();
        ultraBook.battary();
        ultraBook.monitor();
        ultraBook.processor();
        System.out.println();
        workstation.monitor();
        workstation.processor();
    }
}
