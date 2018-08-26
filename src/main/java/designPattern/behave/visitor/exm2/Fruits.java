package designPattern.behave.visitor.exm2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Fruits implements ItemElement {
    private int pricePerKg;
    private int weight;
    private String name;

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
