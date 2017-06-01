package homework.exceptions;

/**
 * Created by 4oc3p on 31.05.2017. Java_core
 */
public class MyExceptionOne extends Exception{
    private String msg;

    public MyExceptionOne(String msg) {
        this.msg = msg;
    }
    public MyExceptionOne() {
        this.msg = "Exception one with default constructor";
    }

    @Override
    public String getMessage() {
        return msg + " + get";
    }
}
