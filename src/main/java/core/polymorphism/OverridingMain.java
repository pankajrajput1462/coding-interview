package core.polymorphism;

import java.sql.SQLDataException;
import java.sql.SQLException;

class Parent {
    public void fun() throws Exception {
        System.out.println(this.getClass().getName());
    }

    public static void sFun() {
        System.out.println("Static Parent Method");
    }
}

class Child extends Parent {
    public void fun() throws SQLException {
        System.out.println(this.getClass().getName());
    }

    public static void sFun() {
        System.out.println("Static Child Method");
    }
}

public class OverridingMain {
    public static void main(String[] args) throws SQLException {
        Child child = new Child();
        child.fun();
        Child.sFun();
    }
}
