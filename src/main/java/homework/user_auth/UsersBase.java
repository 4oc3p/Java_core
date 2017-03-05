package homework.user_auth;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Scanner;


/**
 * Created by 4oc3p on 05.03.2017. Java_core
 */
public class UsersBase {
    private User[] usersBaseArray;


    public void addUserToBase(User user) {
        this.usersBaseArray = ArrayUtils.add(usersBaseArray, user);
    }

    private boolean isAuthenticated(User user) {
        for (User eachUser : usersBaseArray) {
            if (user.getLogin().equals(eachUser.getLogin()) && user.getPass().equals(eachUser.getPass())) {
                return true;
            }
        }
        return false;
    }

    public void printUserInfo(User user) {
        if (isAuthenticated(user)) {
            System.out.println("Authentication confirmed. User info: ");
            System.out.println(user.toString());
        } else {
            System.out.println("Authentication failure!");
        }
    }
}
