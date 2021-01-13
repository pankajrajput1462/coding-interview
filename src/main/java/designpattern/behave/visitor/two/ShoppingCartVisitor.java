package designpattern.behave.visitor.two;

/**
 * Visitor is responsible for the visit the model class.
 */
public interface ShoppingCartVisitor {
    /*
    Visit the @Book pojo data.
     */
    int visit(Book book);

    /*
    Visit the @Fruits pojo data.
     */
    int visit(Fruits fruits);
}
