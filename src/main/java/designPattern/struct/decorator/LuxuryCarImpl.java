package designPattern.struct.decorator;

public class LuxuryCarImpl extends CarDecorator {
    public LuxuryCarImpl(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding extra feature in Luxury car");
    }
}
