package designpattern.behave.visitor.one;

public class Foo implements Element {

    public void visit(Visitor v) {
        v.visit(this);
    }

    public String getFOO() {
        return "Foo";
    }
}
