package designPattern.struct.decorator;

public class LuxuryCarImpl extends CarDecorator {
    public LuxuryCarImpl(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Basic adding extra feature in Luxury car");
    }
}
