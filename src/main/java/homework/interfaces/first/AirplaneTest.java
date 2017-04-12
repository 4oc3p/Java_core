package homework.interfaces.first;

/**
 * Created by 4oc3p on 13.04.2017. Java_core
 */
public class AirplaneTest {
    public static void main(String[] args) {
        Airplane boeing = new Airplane("Boeing", 1000, 50000, 200, "First Class");
        System.out.println(boeing.getPassengerCapacity());
    }
}
