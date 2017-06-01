package homework.exceptions;


/**
 * Created by 4oc3p on 31.05.2017. Java_core
 */
public class Third {

    public static void main(String[] args) {
        try {
            System.out.println("Try");
            Help.throwException(2);
        } catch (MyExceptionOne e1) {
            System.out.println(e1.getMessage());
        }
    }
}

class Help{
    public static void throwException(int i) throws MyExceptionOne {
        System.out.println("Text from Help class");
        if(i == 1){
            throw new MyExceptionOne();
        }
    }
}
