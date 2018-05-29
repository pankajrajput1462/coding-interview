package core.nestedclass;

public class Outer {

    static int one;
    private int two;

    static class StaticInner {//can access only static variable

        public static void inside() {
            System.out.println(one);
        }
    }

    class Inner {
        public void fun() {
            System.out.println(two + one);
            nestedTest();
        }
    }


    public static void nestedTest() {
        System.out.println("Static");
    }


}
