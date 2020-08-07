package javainaction.optional;

import java.util.Optional;

public class OptionalSample {

    public static void main(String[] args) {

        Person person = new Person();

        //String carInsuranceName = getCarInsuranceName(person);
        String carInsuranceNameWithOptional = getCarInsuranceNameWithOptional(person);
        System.out.println(carInsuranceNameWithOptional);

    }

    private static String getCarInsuranceNameWithOptional(Person person) {
        Optional<Person> person1 = Optional.ofNullable(person);
        return person1.map(Person::getCar)
                .map(Car::getInsurence)
                .map(Insurence::getName)
                .orElse("Unknown");
    }

    private static String getCarInsuranceName(Person person) {
        return person.getCar().getInsurence().getName();
    }

}
