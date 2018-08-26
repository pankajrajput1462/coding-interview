package designPattern.behave.visitor.exm2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book implements ItemElement {

    private int price;
    private String isbn;

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
