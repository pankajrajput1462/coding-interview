package designpattern.struct.decorator;

public class SportsCarImpl extends CarDecorator {
    public SportsCarImpl(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println(" Sport Adding extra feature here");
    }
}
