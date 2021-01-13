package designpattern.behave.visitor.two;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book implements ItemElement {

    private int price;
    private String isbn;

    @Override
    public int visit(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
