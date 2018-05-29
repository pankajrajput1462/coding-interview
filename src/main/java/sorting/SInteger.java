package sorting;

public class SInteger {

	private int integer;
	private static int count_compare;
	private static int count_assign;
	private static int count_exchange;

	public SInteger() {
		integer = 0;
	}

	public SInteger(int i) {
		integer = i;
	}

	public SInteger(SInteger value) {
		integer = value.integer;
	}

	public int compareTo(SInteger other) {
		count_compare++;
		return integer - other.integer;
	}

	public static int compareTo(SInteger a, SInteger b) {
		count_compare++;
		return a.integer - b.integer;
	}

	public void assign(SInteger value) {
		count_assign++;
		integer = value.integer;
	}

	public static void assign(SInteger a, SInteger b) {
		count_assign++;
		a.integer = b.integer;
	}

	public void exchange(SInteger other) {
		count_exchange++;
		// exchange only if object values are different
		if (this != other) {
			SInteger temp = new SInteger();

			temp.assign(this);
			assign(other);
			other.assign(temp);
		}
	}

	public static void exchange(SInteger a, SInteger b) {
		count_exchange++;
		// exchange only if object values are different
		if (a != b) {
			SInteger temp = new SInteger();

			temp.assign(a);
			a.assign(b);
			b.assign(temp);
		}
	}

	public String toString() {
		return Integer.toString(integer);
	}

	public int integer() {
		return integer;
	}

	public static int getCountCompare() {
		return count_compare;
	}

	public static int getCountAssign() {
		return count_assign;
	}

	public static int getCountExchange() {
		return count_exchange;
	}

	public static void resetCounts() {
		count_compare = 0;
		count_assign = 0;
		count_exchange = 0;
	}
}
