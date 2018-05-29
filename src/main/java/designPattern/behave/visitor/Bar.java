package designPattern.behave.visitor;

public class Bar implements  Element{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getBAR()
    {
        return "Bar";
    }
}
