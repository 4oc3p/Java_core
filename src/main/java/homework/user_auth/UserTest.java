package homework.user_auth;

/**
 * Created by 4oc3p on 05.03.2017. Java_core
 */
public class UserTest {
    public static void main(String[] args) {
        User user1 = new User("Qwe", 25, "admin", "qwe", "asd");
        User user2 = new User("Qwer", 22, "user", "asd", "zxc");
        User user3 = new User();

        UsersBase usersBase = new UsersBase();
        usersBase.addUserToBase(user1);
        usersBase.addUserToBase(user2);

        usersBase.printUserInfo(user2);
    }
}
