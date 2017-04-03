package homework.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 4oc3p on 31.03.2017. Java_core
 */
public enum UserLevel {
    LEVEL_1, LEVEL_2, LEVEL_3, DEFAULT_LEVEL;

    public static UserLevel getUserLevelByInput(String input) {
        Pattern p1 = Pattern.compile("^l?e?v?e?l?_?1$");
        Pattern p2 = Pattern.compile("^l?e?v?e?l?_?2$");
        Pattern p3 = Pattern.compile("^l?e?v?e?l?_?3$");
        Matcher a1 = p1.matcher(input.toLowerCase());
        Matcher a2 = p2.matcher(input.toLowerCase());
        Matcher a3 = p3.matcher(input.toLowerCase());
        if (a1.matches()) {
            return LEVEL_1;
        }
        if (a2.matches()) {
            return LEVEL_2;
        }
        if (a3.matches()) {
            return LEVEL_3;
        }
        return DEFAULT_LEVEL;
    }
}
