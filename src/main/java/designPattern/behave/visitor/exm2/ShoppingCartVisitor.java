package designPattern.behave.visitor.exm2;

public interface ShoppingCartVisitor {
    int visit(Book book);

    int visit(Fruits fruits);
}
