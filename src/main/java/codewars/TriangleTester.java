package codewars;

/**
 * Created by 4oc3p on 04.07.2017. Java_core
 */
public class TriangleTester{

    public static void main(String[] args) {
        System.out.println(isTriangle(1, 2, 2));
    }

    public static boolean isTriangle(int a, int b, int c){
        if(a > 0 && b > 0 && c > 0){
            if (a + b > c && b + c > a && a + c > b){
                return true;
            }
        }
        return false;
    }
}
