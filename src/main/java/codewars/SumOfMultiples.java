package codewars;

import java.util.stream.IntStream;

/**
 * Created by 4oc3p on 17.09.2017. Java_core
 */
public class SumOfMultiples {

    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int number) {
        //TODO: Code stuff here
//        int sum = 0;
//        for (int i = 0; i < number; i++) {
//            if (i % 3 == 0 || i % 5 == 0){
//                sum += i;
//            }
//        }
        return IntStream.range(0, number)
                .filter(a -> (a % 3 == 0) || (a % 5 == 0))
                .sum();
    }
}
