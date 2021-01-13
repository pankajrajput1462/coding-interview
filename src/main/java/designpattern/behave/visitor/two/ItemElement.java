package designpattern.behave.visitor.two;

/*
  This interface is implemented by Pojo class for visiting the data.
 */
public interface ItemElement {
    /*
       This method is responsible for the accepting the visitor implementation.
     */
    int visit(ShoppingCartVisitor visitor);
}
