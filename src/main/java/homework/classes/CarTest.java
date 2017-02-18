package homework.classes;

/**
 * Created by 4oc3p on 18.02.2017. Java_core
 */
public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car(1987, 234000, "Red", "Honda");
        car1.carInfo();
        System.out.println("Пробег в год: " + car1.mileagePerYear());
        System.out.println(car1.increaseMileage(250));
        car1.carInfo();
    }
}
