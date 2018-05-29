package javainaction.javaone;
/**
 * 
 * @author pankajkumar
 *
 *1. you get what is in the base methods.
 *2. you may override default method.
 *3.if a method is there in the class hiearchy it takes precedence.
 *4. 
 */

public interface Fly {

	default void takeoff() {
		System.out.println("ok");
	}

	default void turn() {
		System.out.println("ok");
	}

	default void cruise() {
		System.out.println("ok");
	}
}
