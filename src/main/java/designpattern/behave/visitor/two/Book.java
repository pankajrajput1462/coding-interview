package designpattern.behave.visitor.two;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book implements VisitableItem {

    private int price;
    private String isbn;
    private int tax;

    @Override
    public int visit(CartVisitor visitor) {
        return visitor.visit(this);
    }
}
