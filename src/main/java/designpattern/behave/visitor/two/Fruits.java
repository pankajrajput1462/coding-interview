package designpattern.behave.visitor.two;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Fruits implements ItemElement {
    private int pricePerKg;
    private int weight;
    private String name;

    @Override
    public int visit(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
