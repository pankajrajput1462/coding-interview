package javainaction.java8;

import javainaction.javaone.Person;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class FuntionalInterface {

    public static void main(String[] args) {
        Supplier<Person> supplier = () -> new Person(21, "Pankaj");
        supplier.get();
    }
    IntSupplier supplier= () -> 4;
}

