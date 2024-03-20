package core.nestedclass;

public class InnerMain {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.fun();

        Outer.StaticInner staticInner = new Outer.StaticInner();
        staticInner.inside();

    }
}
