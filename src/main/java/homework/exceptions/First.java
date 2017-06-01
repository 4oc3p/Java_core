package homework.exceptions;

/**
 * Created by 4oc3p on 31.05.2017. Java_core
 */
public class First {

    public static void main(String[] args) {
        try {
            throw new Exception("Exception in main");
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        } finally {
            System.out.println("I've been here");
        }
    }

}
