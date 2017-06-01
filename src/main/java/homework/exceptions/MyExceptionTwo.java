package homework.exceptions;

/**
 * Created by 4oc3p on 01.06.2017. Java_core
 */
public class MyExceptionTwo extends Exception{

    public MyExceptionTwo(Throwable e) {
        initCause(e);
    }
}
