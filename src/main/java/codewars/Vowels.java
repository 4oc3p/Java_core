package codewars;

import java.util.Arrays;

/**
 * Created by 4oc3p on 06.07.2017. Java_core
 */
public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        Character [] characters = new Character[]{'a', 'e', 'i', 'o', 'u'};
        for (Character c1:str.toCharArray()) {
            for (Character c2:characters){
                if (c1.equals(c2)) vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
