package designpattern.behave.visitor.one;

public interface Visitor {
    void visit(Foo foo);

    void visit(Bar bar);

    void visit(Baz baz);
}
