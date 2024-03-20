package designpattern.behave.visitor.two;

/*
  This interface is implemented by Pojo class for visiting the data.
 */
public interface VisitableItem {
    /*
       This method is responsible for the accepting the visitor implementation.
     */
    int visit(CartVisitor visitor);
}
