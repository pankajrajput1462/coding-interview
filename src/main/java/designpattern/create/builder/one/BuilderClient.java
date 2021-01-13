package designpattern.create.builder;

import java.util.concurrent.atomic.AtomicReference;

public class BuilderClient {
    public static void main(String[] args) {
        //Concrete build
        HomeBuilder concreteHomeBuilder = new ConcreteHomeBuilder();
        AtomicReference<HomeBuildDirector> homeBuildDirector = new AtomicReference<>(new HomeBuildDirector(concreteHomeBuilder));
        System.out.println(homeBuildDirector.get().construct());

        //Wooden home build
        HomeBuilder woodenHomeBuilder = new WoodenHomeBuilder();
        homeBuildDirector.set(new HomeBuildDirector(woodenHomeBuilder));
        System.out.println(homeBuildDirector.get().construct());

    }
}
