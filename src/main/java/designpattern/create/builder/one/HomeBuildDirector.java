package designpattern.create.builder;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HomeBuildDirector {
    private HomeBuilder homeBuilder;

    public Home construct() {
        return homeBuilder.createFloor().createRoof().createWalls().build();
    }
}
