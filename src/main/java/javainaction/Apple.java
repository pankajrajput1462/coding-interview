package javainaction;

/**
 * Created by psi143 on 2/20/2017.
 */
public class Apple {

    private String name;
    private String color;
    private String environment;
    private String place;
    private int weight;

    public Apple(String name, String color, String environment, String place, int weight) {
            this.name=name;
            this.color=color;
            this.environment=environment;
            this.place=place;
            this.weight=weight;
    }

    public Apple() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name=" + name +
                ", color='" + color + '\'' +
                ", environment='" + environment + '\'' +
                ", place='" + place + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
