package designPattern.struct.decorator;

public class SportsCarImpl extends CarDecorator {
    public SportsCarImpl(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding extra feature here");
    }
}
