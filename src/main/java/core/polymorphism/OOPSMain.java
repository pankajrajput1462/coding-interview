package core.polymorphism;

import concurrency.exception.AirthmaticException;

class Base {
    int baseData = 10;

    static {
        System.out.println("Static Block- Base ");
    }

    {
        System.out.println("Block-Base");
    }


    public Base() {
        System.out.println("Base Constructor");
    }

    public void fun1() {
        System.out.println("Base Fun1: " + this.getClass().getName());
    }

    public void funOverRide() {
        System.out.println("Base Fun2: " + this.getClass().getName());
    }

    public void fun3() {
        System.out.println("Poly Fun2: " + this.getClass().getName());
    }

    public int getValue() {
        return baseData;
    }

}

class BaseImpl extends Base {
    int baseData = 20;

    static {
        System.out.println("Static Block-Child");
    }

    {
        System.out.println("Block-child");
    }

    public BaseImpl() {
        System.out.println("Child Constructor");
    }

    public void fun1() {
        System.out.println("Child Fun1: " + this.getClass().getName());
    }

    public void funOverRide() {
        System.out.println("Child Fun2: " + this.getClass().getName());
    }

    public void funOverRide(int a) {
        System.out.println("Child Fun2: " + this.getClass().getName());
    }

    public void funOverRide(float a) {
        System.out.println("Child Fun2: " + this.getClass().getName());
    }

    public int getValue() {
        return baseData;
    }
}

public class OOPSMain {


    public static void main(String[] args) {

        Base base = new BaseImpl();
        base.fun1();
        base.funOverRide();
        System.out.println(base.getValue());

//        Casting
        Base base1 = new Base();
//        BaseImpl base2 = (BaseImpl) base1;// Runtime error
//        base2.funOverRide();

        Base base3 = new BaseImpl();
        BaseImpl cast = (BaseImpl) base3;
        cast.funOverRide();
        Base base444 = cast;
        base444.funOverRide();

    }
}
