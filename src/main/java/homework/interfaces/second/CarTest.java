package homework.interfaces.second;

/**
 * Created by 4oc3p on 13.04.2017. Java_core
 */
public class CarTest {
    public static void main(String[] args) {
        Porsche porsche = new Porsche("Porsche", 100);
        porsche.printName();
        System.out.printf("%d, %d, %d, %d", Porsche.minPassengers, Porsche.maxPassengers, Porsche.maxSpeed, Porsche.minSpeed);
    }
}
