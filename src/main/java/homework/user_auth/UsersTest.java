package homework.user_auth;

/**
 * Created by 4oc3p on 05.03.2017. Java_core
 */
public class UsersTest {
    public static void main(String[] args) {
        Users user1 = new Users("Qwe", 25, "admin", "qwe", "asd");
        Users user2 = new Users("Qwer", 22, "user", "asd", "zxc");
        Users user3 = new Users();

        UsersBase usersBase = new UsersBase();
        usersBase.addUserToBase(user1);
        usersBase.addUserToBase(user2);
        usersBase.addUserToBase(user3);

        usersBase.userAuth();
    }
}
