package concurrency.deadlock.otherdeadloack;

public class Deadlock {

	static class Friend {
		private final String name;

		public Friend(String string) {
			this.name = string;
		}

		public String getName() {
			return name;
		}

		public synchronized void bow(Friend friend) {
			System.out.format("%s: %s" + " has bowed back to me!%n", this.name,
					friend.getName());
			friend.bowBack(this);
		}

		public synchronized void bowBack(Friend friend) {
			System.out.format("%s: %s" + " has bowed back to me!%n", this.name,
					friend.getName());

		}

	}

	public static void main(String[] args) {

		final Friend alphonse = new Friend("Alphonse");
		final Friend gaston = new Friend("Gaston");

		new Thread(new Runnable() {

			@Override
			public void run() {

				alphonse.bow(gaston);
			}
		}, "One").start();;

		new Thread(new Runnable() {

			@Override
			public void run() {
				gaston.bow(alphonse);

			}
		}, "Two").start();;
	}

}
