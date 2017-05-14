package homework.managers;

/**
 * Created by Admin on 14.05.2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee john = new Employee("John");
        Employee jack = new Employee("Jack", john);
        Employee bob = new Employee("Bob", jack);
        Employee jerry = new Employee("Jerry", bob);
        Employee.printInfoAboutManagers(jack);
    }
}
