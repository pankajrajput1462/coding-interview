package javainaction.optional;

import java.util.Optional;

public class OptionalSample {

    public static void main(String[] args) {

        Person person = new Person();

        //String carInsurenceName = getCarInsurenceName(person);
        String carInsurenceNameWithOptional = getCarInsurenceNameWithOptional(person);
        System.out.println(carInsurenceNameWithOptional);

    }

    private static String getCarInsurenceNameWithOptional(Person person) {
        Optional<Person> person1 = Optional.ofNullable(person);
        String s = person1.map(Person::getCar).map(Car::getInsurence).map(Insurence::getName).orElse("Unknown");

        return s;
    }

    private static String getCarInsurenceName(Person person) {
        return person.getCar().getInsurence().getName();
    }

}
