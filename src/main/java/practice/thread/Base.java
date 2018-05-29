package practice.thread;

class Parent{
    public Parent() {
        System.out.println("Inside parent Cons");
    }
    static {
        System.out.println("Inside static block ");
    }
    {
        System.out.println("Inside normal block");
    }
}

public class Base extends Parent {
    public Base() {
        System.out.println("Base: Inside Base Cons" );
    }
    static {
        System.out.println("Base: Inside static block ");
    }
    {
        System.out.println("Base: Inside normal block");
    }

    public static void main(String[] args) {
        Base base= new Base();
    }
}


