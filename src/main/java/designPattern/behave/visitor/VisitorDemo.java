package designPattern.behave.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        Element[] elementsList={new Bar(),new Foo(),new Baz()};
        UpVisitor upVisitor= new UpVisitor();
        DownVisitor downVisitor= new DownVisitor();

        for (Element element : elementsList) {
            element.accept(upVisitor);
        }
        for (Element element : elementsList) {
            element.accept(downVisitor);
        }


    }
}
