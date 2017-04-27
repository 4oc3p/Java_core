package homework.user_annotation;

/**
 * Created by 4oc3p on 27.04.2017. Java_core
 */
public class User {

    private String name;
    private String surname;
    private int age;
    private Role role;

    public User(String name, String surname, int age, Role role) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", age=" + age +
            ", role=" + role.toString() +
            '}';
    }
}
