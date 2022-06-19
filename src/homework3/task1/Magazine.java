package homework3.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Magazine implements Printable {
    private Genres genre;
    private int countPages;

    @Override
    public void print() {
        System.out.println(this.getClass().getName());
    }
}
