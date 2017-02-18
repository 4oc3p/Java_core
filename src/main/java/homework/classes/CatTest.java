package homework.classes;

/**
 * Created by 4oc3p on 18.02.2017. Java_core
 */
public class CatTest {
    public static void main(String[] args) {
        Cat cat1 = new Cat(2, 5, "Grey", "Murzik");
        cat1.catInfo();
        Cat cat2 = new Cat(3, 7, "Black", "Barsik");
        cat2.catInfo();
        System.out.println("Сила кота " + cat1.getName() + " = " + cat1.catStrength());
        System.out.println("Сила кота " + cat2.getName() + " = " + cat2.catStrength());
        System.out.printf("Сравнение силы котов %s и %s. Выигрывает %s", cat1.getName(), cat2.getName(), cat1.catCompare(cat2));
    }
}
