package designPattern.behave.visitor;

public class Foo implements Element {

    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getFOO() {
        return "Foo";
    }
}
