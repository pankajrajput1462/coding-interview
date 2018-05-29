package javainaction.javaone;

public interface Utils {

	public static int numberOfCores() {
		return Runtime.getRuntime().availableProcessors();
		
	}
}
