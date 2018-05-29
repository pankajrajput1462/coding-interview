package com.dp;

public class UpVisitor implements Visitor{
    @Override
    public void visit(FOO foo) {
        System.out.println("do up on: "+ foo.getFOO());
    }

    @Override
    public void visit(BAR bar) {
        System.out.println("do up on: "+ bar.getBAR());
    }

    @Override
    public void visit(BAZ baz) {
        System.out.println("do up on: "+ baz.getBAZ());
    }
}
