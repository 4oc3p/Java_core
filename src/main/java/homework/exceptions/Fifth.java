package homework.exceptions;

/**
 * Created by 4oc3p on 01.06.2017. Java_core
 */
public class Fifth {

    public static void main(String[] args) throws MyExceptionThree, MyExceptionTwo, MyExceptionFour {
        try {
            a();
        } catch (MyExceptionTwo | MyExceptionFour | MyExceptionThree myExceptionTwo) {
            myExceptionTwo.printStackTrace();
        }
    }


    private static Throwable c() throws MyExceptionThree {
        throw new MyExceptionThree();
    }

    private static Throwable b() throws MyExceptionTwo, MyExceptionThree {
        throw new MyExceptionTwo(c());
    }

    private static Throwable a() throws  MyExceptionTwo, MyExceptionThree, MyExceptionFour {
        throw new MyExceptionFour(b());
    }

}
