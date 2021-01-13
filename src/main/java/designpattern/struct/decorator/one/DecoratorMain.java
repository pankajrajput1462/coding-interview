package designpattern.struct.decorator;

/**
 * https://www.journaldev.com/1540/decorator-design-pattern-in-java-example
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Car car = new SportsCarImpl(new BasicCarImpl());
        car.assemble();
        System.out.println("+++++++++++++++++++++++++++++");
        //added extra feature to the the car
        Car lotOfFeature = new LuxuryCarImpl(new SportsCarImpl(new BasicCarImpl()));
        lotOfFeature.assemble();
    }
}
