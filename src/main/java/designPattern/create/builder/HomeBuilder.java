package designPattern.create.builder;

public interface HomeBuilder {

    HomeBuilder createRoof();

    HomeBuilder createFloor();

    HomeBuilder createWalls();

    Home build();
}
