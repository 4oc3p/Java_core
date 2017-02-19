package homework.classes;

/**
 * Created by 4oc3p on 18.02.2017. Java_core
 */
public class Cat {
    private int age;
    private int weight;
    private String color;
    private String name;

    public String getName() {
        return name;
    }

    public Cat(int age, int weight, String color, String name) {
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.name = name;
    }

    public void catInfo() {
        System.out.printf("Имя: %s, цвет: %s, возраст: %d, вес: %d\n", this.name, this.color, this.age, this.weight);
    }


    public int catStrength() {
        return this.age * this.weight;
    }

    public String catCompare(Cat otherCat) {
        return this.catStrength() > otherCat.catStrength() ? this.name : otherCat.name;
    }

}
