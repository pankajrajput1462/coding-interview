package concurrency.waitandnotify.one;

public class WaitAndNotifyExample {

    public static void main(String[] args) {
        Message message = new Message();
        message.setMsg("Pankaj");
        Waiter waiter = new Waiter(message);
        new Thread(waiter, "waiter").start();

        Notifier notifier = new Notifier(message);
        new Thread(notifier, "notifier").start();


    }

}
