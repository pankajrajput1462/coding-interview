package customexeption;

public class ListTooLargeException extends RuntimeException {
	public ListTooLargeException(String message) {
		super(message);
	}
}
