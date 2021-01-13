package designpattern.create.builder;

public class WoodenHomeBuilder implements HomeBuilder {

    private final Home home;

    public WoodenHomeBuilder() {
        this.home = new Home();
    }

    @Override
    public HomeBuilder createRoof() {
        home.setRoofType("WoodenRoofCreated");
        return this;
    }

    @Override
    public HomeBuilder createFloor() {
        home.setFloorType("WoodenFloorCreated");
        return this;
    }

    @Override
    public HomeBuilder createWalls() {
        home.setWallType("WoodenWallCreated");
        return this;
    }

    public Home build() {
        return home;
    }

    @Override
    public HomeBuilder builder() {
        return this;
    }
}
