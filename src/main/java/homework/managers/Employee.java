package homework.managers;

/**
 * Created by Admin on 14.05.2017.
 */
public class Employee {
    private static String delimiter = "";
    private String name;
    private Employee manager;

    public Employee(String name, Employee manager) {
        this.name = name;
        this.manager = manager;
    }

    public Employee(String name) {
        this.name = name;
    }

    public static void printInfoAboutManagers(Employee employee){
        if(employee.manager != null){
            printInfoAboutManagers(employee.manager);
            delimiter += "_";
            System.out.print("|" + delimiter);
            System.out.println(employee.name + "'s manager is " + employee.manager.name);
        } else {
            System.out.println(employee.name + " is on the highest position");
            delimiter = "";
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", manager=" + manager +
                '}';
    }
}
