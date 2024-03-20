package designpattern.behave.visitor.two;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Fruits implements VisitableItem {
    private int pricePerKg;
    private int weight;
    private String name;
    private int tax;

    @Override
    public int visit(CartVisitor visitor) {
        return visitor.visit(this);
    }
}
