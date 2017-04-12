package homework.interfaces.first;

/**
 * Created by 4oc3p on 12.04.2017. Java_core
 */
public class Airplane implements Fly {
    private String name;
    private int speed;
    private int weight;
    private int passengerCapacity;
    private String specification;

    public Airplane(String name, int speed, int weight, int passengerCapacity, String specification) {
        this.name = name;
        this.speed = speed;
        this.weight = weight;
        this.passengerCapacity = passengerCapacity;
        this.specification = specification;
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public int getPassengerCapacity() {
        return this.passengerCapacity;
    }

    @Override
    public String getSpecification() {
        return this.specification;
    }
}
