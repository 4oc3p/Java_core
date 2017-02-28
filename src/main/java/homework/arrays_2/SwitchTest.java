package homework.arrays_2;

/**
 * Created by 4oc3p on 28.02.2017. Java_core
 */
public class SwitchTest {
    public static final String ADMIN = "admin";
    public static final String USER2 = "user_2";
    public static final String USER3 = "user_3";

    public static void main(String[] args) {
        User user1 = new User("admin");
        User user2 = new User("user_2");
        User user3 = new User("user_3");
        User user4 = new User("guest");
        switch (user4.getUserRole()) {
            case ADMIN:
                System.out.println("rwx");
                break;
            case USER2:
            case USER3:
                System.out.println("rw");
                break;
            default:
                System.out.println("r");

        }
    }

    static class User {
        private final String userRole;

        public User(String userRole) {

            this.userRole = userRole;
        }

        public String getUserRole() {
            return userRole;
        }
    }
}
