package customexeption;

public class TooLargeException extends ListTooLargeException {
    public TooLargeException(String message) {
        super(message);
    }
}
