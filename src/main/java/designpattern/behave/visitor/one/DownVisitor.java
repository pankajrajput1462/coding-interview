package designpattern.behave.visitor.one;

public class DownVisitor implements Visitor {
    @Override
    public void visit(Foo foo) {
        System.out.println("do down on: " + foo.getFOO());
    }

    @Override
    public void visit(Bar bar) {
        System.out.println("do down on: " + bar.getBAR());
    }

    @Override
    public void visit(Baz baz) {
        System.out.println("do down on: " + baz.getBAZ());
    }
}
