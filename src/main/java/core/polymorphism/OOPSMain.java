package core.polymorphism;

class Base {
    int baseData = 10;

    public Base() {
        System.out.println("Base Constructor");
    }

    public void fun1() {
        System.out.println("Base Fun1: " + this.getClass().getName());
    }

    public void fun2() {
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

    public BaseImpl() {
        System.out.println("Child Constructor");
    }

    public void fun1() {
        System.out.println("Child Fun1: " + this.getClass().getName());
    }

    public void fun2() {
        System.out.println("Child Fun2: " + this.getClass().getName());
    }

    public void fun2(int a) {
        System.out.println("Child Fun2: " + this.getClass().getName());
    }

    public void fun2(float a) {
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
        base.fun2();
        System.out.println(base.getValue());
    }
}
