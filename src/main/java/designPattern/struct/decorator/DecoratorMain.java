package designPattern.struct.decorator;

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
