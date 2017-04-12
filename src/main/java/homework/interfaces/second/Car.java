package homework.interfaces.second;

/**
 * Created by 4oc3p on 13.04.2017. Java_core
 */
public abstract class Car implements Machine {
    private String transportName;
    private int currentSpeed;

    public Car(String transportName, int currentSpeed) {
        this.transportName = transportName;
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void printName() {
        System.out.println(this.transportName);
    }
}
