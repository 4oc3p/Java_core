package homework.interfaces.third;

/**
 * Created by 4oc3p on 13.04.2017. Java_core
 */
public class Ship extends Boat {
    private String boatClass;

    public Ship(int maxSpeed, int displacement, String name, int maxPassengers, String boatClass) {
        super(maxSpeed, displacement, name, maxPassengers);
        this.boatClass = boatClass;
    }

    @Override
    public void printDisplacement() {
        System.out.println(super.getDisplacement());
    }
}
