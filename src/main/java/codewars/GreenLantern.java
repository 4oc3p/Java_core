package codewars;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 4oc3p on 15.06.2017. Java_core
 */
public class GreenLantern {

    private static final Map<String, String> COLOR_TO_COLOR_MAP;

    static {
        COLOR_TO_COLOR_MAP = new HashMap<>();
        COLOR_TO_COLOR_MAP.put("gold", "ForestGreen");
        COLOR_TO_COLOR_MAP.put("khaki ", "LimeGreen");
        COLOR_TO_COLOR_MAP.put("lemonchiffon", "PaleGreen");
        COLOR_TO_COLOR_MAP.put("lightgoldenrodyellow", "SpringGreen");
        COLOR_TO_COLOR_MAP.put("lightyellow", "MintCream");
        COLOR_TO_COLOR_MAP.put("palegoldenrod", "LightGreen");
        COLOR_TO_COLOR_MAP.put("yellow", "Lime");
    }

    public static String yellowBeGone(String colorNameOrCode) {
        if (colorNameOrCode.startsWith("#")) {
            int rInt = Integer.parseInt(colorNameOrCode.substring(1, 3), 16);
            int gInt = Integer.parseInt(colorNameOrCode.substring(3, 5), 16);
            int bInt = Integer.parseInt(colorNameOrCode.substring(5, 7), 16);
            if (rInt > bInt && gInt > bInt) {
                return String.format("#%s%s", colorNameOrCode.substring(5),
                        rInt > gInt
                                ? colorNameOrCode.substring(1, 5)
                                : colorNameOrCode.substring(3, 5) + colorNameOrCode.substring(1, 3));
            }
            return colorNameOrCode;
        }
        return COLOR_TO_COLOR_MAP.containsKey(colorNameOrCode.toLowerCase())
                ? colorNameOrCode
                : COLOR_TO_COLOR_MAP.get(colorNameOrCode.toLowerCase());
    }
}
