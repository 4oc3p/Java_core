package homework.classes_2;

/**
 * Created by 4oc3p on 10.03.2017. Java_core
 */
public class CarTest {
    public static void main(String[] args) {
        Lorry lorry = new Lorry("Kamaz", 5000, 700, 4600);
        System.out.println(lorry);
        lorry.setModel("MAN");
        System.out.println(lorry);
    }

}

class Car {
    protected String model;
    private int weight;
    private int power;

    public Car(String model, int weight, int power) {
        this.model = model;
        this.weight = weight;
        this.power = power;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", power=" + power +
                '}';
    }
}

class Lorry extends Car {
    private int carryingCapacity;


    public Lorry(String model, int weight, int power, int carryingCapacity) {
        super(model, weight, power);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public String toString() {
        return "Lorry{" + super.toString() +
                "carryingCapacity=" + carryingCapacity +
                '}';
    }
}
