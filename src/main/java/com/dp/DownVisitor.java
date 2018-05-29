package com.dp;

public class DownVisitor implements Visitor {
    @Override
    public void visit(FOO foo) {
        System.out.println("do down on: "+ foo.getFOO());
    }

    @Override
    public void visit(BAR bar) {
        System.out.println("do down on: "+ bar.getBAR());
    }

    @Override
    public void visit(BAZ baz) {
        System.out.println("do down on: "+ baz.getBAZ());
    }
}
