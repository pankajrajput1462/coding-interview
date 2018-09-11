package designPattern.behave.observer;

public class ObserverClient {
    public static void main(String[] args) {
        Order order = new Order();
        //Creating an order
        order.addItem(new Item("Pizza",6.99));
        order.addItem(new Item("IceCream",4.99));
        order.addItem(new Item("Orange",99.99));
        order.addItem(new Item("Bread",6.99));

        //Creating payments
        order.makePayment(new Payment("CASH",20.3));
        order.makePayment(new Payment("CARD",20.3));
        order.makePayment(new Payment("MOBILE",20.3));

        order.completeOrder();
    }
}
