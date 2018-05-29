package com.dp;

public class VisitorDemo {
    public static void main(String[] args) {
        Element[] elementsList={new BAR(),new FOO(),new BAZ()};
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
