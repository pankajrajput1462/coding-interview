package designpattern.behave.visitor.two;

public class TaxVisitorImpl implements CartVisitor {
    @Override
    public int visit(Book book) {
        return book.getTax() + 2;
    }

    @Override
    public int visit(Fruits fruits) {
        return fruits.getTax() + 1;
    }
}
