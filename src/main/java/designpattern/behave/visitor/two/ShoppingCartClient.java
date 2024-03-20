package designpattern.behave.visitor.two;

public class ShoppingCartClient {
    public static void main(String[] args) {
        VisitableItem[] items = {
                new Book(20, "1234", 1),
                new Book(100, "5678", 2),
                new Fruits(10, 2, "Banana", 3),
                new Fruits(5, 5, "Apple", 5)};
        int total = calculate(items);
        System.out.println("total = " + total);

    }

    private static int calculate(VisitableItem[] items) {
        CartVisitor cartVisitor = new CartVisitorImpl();
        CartVisitor taxVisitor = new TaxVisitorImpl();
        int sum = 0;
        for (VisitableItem item : items) {
            sum = sum + item.visit(cartVisitor) + item.visit(taxVisitor);
        }
        return sum;
    }
}
