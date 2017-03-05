package homework.user_auth;

/**
 * Created by 4oc3p on 05.03.2017. Java_core
 */
public class User {
    private static int DEF_USER_NUM = 1;
    private String name;
    private int age;
    private String role;
    private String login;
    private String pass;

    public User() {
        this.name = "N/A";
        this.role = "default_user";
        this.login = "user" + DEF_USER_NUM;
        this.pass = "pass" + DEF_USER_NUM;
        DEF_USER_NUM++;
    }

    public User(String name, int age, String role, String login, String pass) {

        this.name = name;
        this.age = age;
        this.role = role;
        this.login = login;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }

    String getLogin() {
        return login;
    }

    String getPass() {
        return pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                ", login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
