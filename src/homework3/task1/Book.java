package homework3.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Printable{
    private int countPages;
    private double price;

    @Override
    public void print() {
        System.out.println(this.getClass().getName());

    }
}
