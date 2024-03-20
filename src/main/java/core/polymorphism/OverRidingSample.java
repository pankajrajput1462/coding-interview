package core.polymorphism;

import java.io.IOException;

public class OverRidingSample {
    void sum(int a, int b) {
        System.out.println("int arg method invoked");
    }

    void sum(long a, long b) throws Exception {
        System.out.println("long arg method invoked");
    }

    void sum(float a, float b) throws Exception {
        System.out.println("long arg method invoked");
    }

    void sum(double a, double b) throws Exception {
        System.out.println("long arg method invoked");
    }


    public static void main(String[] args) throws Exception {
        OverRidingSample obj = new OverRidingSample();
        obj.sum(20, 20);
        obj.sum(555555555555555l, 555555555555555555l);
        obj.sum(555555555555555.0, 555555555555555555.0);
    }
}
