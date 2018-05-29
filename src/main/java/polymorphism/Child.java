package polymorphism;

class Base {

    public Base() {
        System.out.println("Base C");
    }

    public void fun1() {
        System.out.println("Base Fun1");
        this.fun2();
        //fun2();
    }

    public void fun2() {
        System.out.println("Base Fun2");
    }

    public void fun3() {
        System.out.println("Poly Fun2");
    }

}

public class Child extends Base {
    public Child() {
        System.out.println("PolyC");
    }

	public void fun1() {
		System.out.println("Poly Fun1");
		super.fun2();
	}

    public void fun2() {
        System.out.println("Poly Fun2");
    }

    public void fun2(int a) {
        System.out.println("Poly Fun2");
    }
    public void fun2(float a) {
        System.out.println("Poly Fun2");
    }

    /*private void fun3() {
        System.out.println("Poly Fun2");

    }*/

    public static void main(String[] args) {

        Base base = new Child();
        base.fun1();
    }
}
