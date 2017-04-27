package homework.user_annotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by 4oc3p on 27.04.2017. Java_core
 */
public class UserServiceTest {

    public static void main(String[] args)
        throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException {
        UserService userService = new UserService();
        Field role = userService.getClass().getDeclaredField("role");
        role.setAccessible(true);
        UserRoleAnnotation declaredAnnotation = role.getDeclaredAnnotation(UserRoleAnnotation.class);
        Object user = User.class.getDeclaredConstructor(String.class, String.class, int.class, Role.class)
            .newInstance("1", "2", 3, declaredAnnotation.role());
        System.out.println(user);
    }

}
