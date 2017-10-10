package codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by 4oc3p on 13.07.2017. Java_core
 */
public class DnaStrand {

    public static String makeComplement(String dna) {
        return Arrays.stream(dna.split(""))
                .map(a -> a.equals("A") ? "T"
                        : a.equals("T") ? "A"
                        : a.equals("C") ? "G"
                        : a.equals("G") ? "C"
                        : a)
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(makeComplement("TAACG"));
    }
}
