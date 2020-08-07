package designPattern.struct.decorator;

public class CarDecorator implements Car {
    private final Car car;

    public CarDecorator(Car car) {
        System.out.println("Setting");
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
