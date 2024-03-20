package core.abstraction;

public class AbstractionMain {

    public static void main(String[] args) {
        AbstractBus abstractBus = new AbstractBus() {
            @Override
            public void busService() {
                System.out.println(" I ma new object");
            }
        };
        String busName = abstractBus.busName();
        System.out.println("busName = " + busName);
        abstractBus.busService();

        AbstractBus abstractBus1 = new AbstractBusImpl();
        abstractBus1.busService();
    }
}
