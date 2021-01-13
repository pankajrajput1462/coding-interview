package designpattern.behave.visitor.one;

public class Baz implements  Element{
    @Override
    public void visit(Visitor v) {
        v.visit(this);
    }
    public  String getBAZ()
    {
        return  "Baz";
    }
}
