package designPattern.behave.visitor;

public class Baz implements  Element{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    public  String getBAZ()
    {
        return  "Baz";
    }
}
