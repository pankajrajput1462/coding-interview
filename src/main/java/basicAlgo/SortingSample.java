package basicAlgo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingSample {
    public static void main(String[] args) {

        FavLocation favLocation1= new FavLocation();
        favLocation1.setId("fav_3");
        favLocation1.setLocation("China");

        FavLocation favLocation2= new FavLocation();
        favLocation2.setId("fav_1");
        favLocation2.setLocation("India");

        FavLocation favLocation3= new FavLocation();
        favLocation3.setId("fav_2");
        favLocation3.setLocation("Pp");

        List<FavLocation> favLocations= new ArrayList<>();
        favLocations.add(favLocation1);
        favLocations.add(favLocation2);
        favLocations.add(favLocation3);

        favLocations.forEach(System.out::println);
        favLocations.stream().sorted((o1, o2) -> o2.getLocation().compareToIgnoreCase(o1.getLocation()));
        List<String> collect = favLocations.stream().map(favLocation -> favLocation.getId()).map(Integer::valueOf).sorted().map(String::valueOf).collect(Collectors.toList());
        collect.forEach(System.out::println);

    }


}
