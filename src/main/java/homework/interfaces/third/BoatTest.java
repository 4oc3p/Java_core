package homework.interfaces.third;

/**
 * Created by 4oc3p on 13.04.2017. Java_core
 */
public class BoatTest {
    public static void main(String[] args) {
        Boat ship = new Ship(20, 2000, "Karablik", 100, "Ship");
        ship.printSpeed();
        ship.printDisplacement();
    }
}
