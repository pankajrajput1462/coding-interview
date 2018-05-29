package designPattern.behave.visitor;

public class UpVisitor implements Visitor{
    @Override
    public void visit(Foo foo) {
        System.out.println("do up on: "+ foo.getFOO());
    }

    @Override
    public void visit(Bar bar) {
        System.out.println("do up on: "+ bar.getBAR());
    }

    @Override
    public void visit(Baz baz) {
        System.out.println("do up on: "+ baz.getBAZ());
    }
}
