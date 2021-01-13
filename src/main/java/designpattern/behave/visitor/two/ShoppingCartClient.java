package designpattern.behave.visitor.two;

public class ShoppingCartClient {
    public static void main(String[] args) {
        ItemElement[] items = {
                new Book(20, "1234"),
                new Book(100, "5678"),
                new Fruits(10, 2, "Banana"),
                new Fruits(5, 5, "Apple")};
        int total = calculate(items);
        System.out.println("total = " + total);

    }

    private static int calculate(ItemElement[] items) {
        ShoppingCartVisitor cartVisitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for (ItemElement item : items) {
            sum = sum + item.visit(cartVisitor);
        }
        return sum;
    }
}
