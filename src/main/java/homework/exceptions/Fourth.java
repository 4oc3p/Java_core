package homework.exceptions;

/**
 * Created by 4oc3p on 01.06.2017. Java_core
 */
public class Fourth {

    public static void main(String[] args) throws MyExceptionOne {
        Helps.f();
    }

}

class Helps{
    public static void f(){
        try {
            g();
        } catch (MyExceptionOne e1) {
            System.out.println(e1.getMessage());
            throw new NullPointerException();
        }
    }

    public static void g() throws MyExceptionOne {
        throw new MyExceptionOne();
    }
}