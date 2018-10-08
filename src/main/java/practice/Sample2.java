package practice;

import java.util.concurrent.ArrayBlockingQueue;

class Message {
    private String msg;

    public Message(String str){
        this.msg=str;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "Message{" +
                "msg='" + msg + '\'' +
                '}';
    }
}

class  Producer1 implements  Runnable{
    private ArrayBlockingQueue<Message> messages;

    public Producer1(ArrayBlockingQueue<Message> messages) {
        this.messages = messages;
    }

    @Override
    public void run() {
        //produces message
            for (int i = 0; i < 100; i++) {
                Message message = new Message("Message: " + i);
                messages.offer(message);
                System.out.println("Produced = " + message);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //adding exit message
            Message exit = new Message("Exit");
            messages.offer(exit);
    }
}
class Consumer1 implements Runnable{
    private ArrayBlockingQueue<Message> messages;

    public Consumer1(ArrayBlockingQueue<Message> messages) {
        this.messages = messages;
    }

    @Override
    public void run() {
        try {
            while (true){
                Message message =  messages.take();
                System.out.println("Take = " + message);
                if (message.getMsg().equalsIgnoreCase("Exit")){
                    System.out.println("Take = " + message);
                    break;
                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Sample2 {

    public static void main(String[] args) {
        ArrayBlockingQueue<Message> messages=new ArrayBlockingQueue<>(10);
        new  Thread(new Producer1(messages)).start();
        new Thread(new Consumer1(messages)).start();
    }
}
