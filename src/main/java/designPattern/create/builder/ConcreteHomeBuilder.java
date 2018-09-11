package designPattern.create.builder;

public class ConcreteHomeBuilder implements HomeBuilder {

    private Home home;

    public ConcreteHomeBuilder() {
        this.home = new Home();
    }

    @Override
    public HomeBuilder createRoof() {
        home.setRoofType("ConcreteRoofCreated");
        return this;
    }

    @Override
    public HomeBuilder createFloor() {
        home.setFloorType("ConcreteFloorCreated");
        return this;
    }

    @Override
    public HomeBuilder createWalls() {
        home.setWallType("ConcreteWallCreated");
        return this;
    }

    public Home build() {
        return home;
    }
}
