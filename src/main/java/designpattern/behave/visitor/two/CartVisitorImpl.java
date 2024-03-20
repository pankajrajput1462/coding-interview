package designpattern.behave.visitor.two;

public class CartVisitorImpl implements CartVisitor {
    @Override
    public int visit(Book book) {
        int cost;
        //apply 5 price discount if book price is more then 50
        int price = book.getPrice();
        if (price > 50) {
            cost = price - 5;
        } else {
            cost = price;
        }
        System.out.println("Book ISBN: " + book.getIsbn() + " " + "price = " + cost);
        return cost;
    }

    @Override
    public int visit(Fruits fruits) {
        int cost = fruits.getPricePerKg() + fruits.getWeight();
        System.out.println(fruits.getName() + " cost = " + cost);
        return cost;
    }
}
