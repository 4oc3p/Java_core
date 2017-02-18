package homework.classes;

import org.joda.time.DateTime;

/**
 * Created by 4oc3p on 18.02.2017. Java_core
 */
public class Car {
    private static final int YEAR = DateTime.now().getYear();
    private int yearOfIssue;
    private int mileage;
    private String color;
    private String carModel;

    public Car(int yearOfIssue, int mileage, String color, String carModel) {
        this.yearOfIssue = yearOfIssue;
        this.mileage = mileage;
        this.color = color;
        this.carModel = carModel;
    }

    public void carInfo() {
        System.out.printf("Модель: %s, год выпуска: %d, пробег: %d, цвет: %s\n", this.carModel, this.yearOfIssue, this.mileage, this.color);
    }

    public int mileagePerYear() {
        return this.mileage / (YEAR - this.yearOfIssue);
    }

    public String increaseMileage(int someKilometres) {
        this.mileage += someKilometres;
        return  "Пробег увеличен на " + someKilometres;
    }
}
