package homework.user_auth;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Scanner;


/**
 * Created by 4oc3p on 05.03.2017. Java_core
 */
public class UsersBase {
    private Users[] usersBaseArray;


    public void addUserToBase(Users user) {
        this.usersBaseArray = ArrayUtils.add(usersBaseArray, user);
    }

    public void userAuth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Login: ");
        String login = scanner.next();
        System.out.println("Pass: ");
        String pass = scanner.next();
        boolean succAuth = false;
        for (Users user : usersBaseArray) {
            if (user.getLogin().equals(login) && user.getPass().equals(pass)) {
                System.out.println("Auth successful: ");
                System.out.printf("Name: %s\nAge: %d\nRole: %s", user.getName(), user.getAge(), user.getRole());
                succAuth = true;
                break;
            }
        }
        if (!succAuth) {
            System.out.println("Auth failed");
        }
    }
}
