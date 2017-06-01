package homework.exceptions;

/**
 * Created by 4oc3p on 31.05.2017. Java_core
 */
public class Second {

    public static void main(String[] args) {
        String s1 = "My exception one with parametrized constructor";
        try {
            throw new MyExceptionOne(s1);
        } catch (MyExceptionOne e1) {
            System.out.println(e1.getMessage());
        }
    }
}
