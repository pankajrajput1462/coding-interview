package designPattern.behave.observer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Order {

    List<Item> cart = new ArrayList<>();
    List<Payment> payments = new ArrayList<>();
    private Topic addItemTopic;
    private Topic addPaymentTopic;
    private Topic completeOrderTopic;

    public Order() {
        Observer agentDisplay = new AgentDisplay();
        Observer customerDisplay = new CustomerDisplay();
         addItemTopic = new AddItemTopic();
         addPaymentTopic = new AddPaymentTopic();
         completeOrderTopic = new CompleteOrderTopic();

        //Agent Display is subscribed to all topics
        addItemTopic.register(agentDisplay);
        addPaymentTopic.register(agentDisplay);
        completeOrderTopic.register(agentDisplay);

        //Customer is subscribed to all topic

        addItemTopic.register(customerDisplay);
        addPaymentTopic.register(customerDisplay);
        completeOrderTopic.register(customerDisplay);
    }
    public void addItem(Item item){
        cart.add(item);
        String line = item.getName() + " $" + item.price;
        addItemTopic.notifyObservers(line);
    }

    public void makePayment(Payment payment){
        payments.add(payment);
        String line = payment.getType() + " $" + payment.getAmount();
        addPaymentTopic.notifyObservers(line);
    }

    public void completeOrder(){
        String line = "Order Completed";
        completeOrderTopic.notifyObservers(line);
    }
}