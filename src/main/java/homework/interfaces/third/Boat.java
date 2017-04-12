package homework.interfaces.third;

/**
 * Created by 4oc3p on 13.04.2017. Java_core
 */
public abstract class Boat {
    private int maxSpeed;
    private int displacement;
    private String name;
    private int maxPassengers;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getName() {
        return name;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public Boat(int maxSpeed, int displacement, String name, int maxPassengers) {
        this.maxSpeed = maxSpeed;
        this.displacement = displacement;
        this.name = name;
        this.maxPassengers = maxPassengers;
    }

    public void printSpeed() {
        System.out.println(maxSpeed);
    }

    public abstract void printDisplacement();

}
