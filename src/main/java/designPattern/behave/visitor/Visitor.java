package designPattern.behave.visitor;

public interface Visitor {
    void visit(Foo foo);
    void visit(Bar bar);
    void visit(Baz baz);
}
