package concurrency.waitandnotify.one;

import concurrency.waitandnotify.one.Message;

public class Notifier implements Runnable {

	Message message;

	public Notifier(Message message) {
		this.message = message;
	}

	public void run() {
		synchronized (message) {
			message.setMsg("Value Changed");
			System.out.println(message.getMsg());
			message.notify();
		}
	}

}
