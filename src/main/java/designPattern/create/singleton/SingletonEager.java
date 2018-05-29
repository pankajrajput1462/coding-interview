package designPattern.create.singleton;

public class SingletonEager {

    private static final SingletonEager singltoneager = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getSingltoneager() {
        return singltoneager;
    }

}
