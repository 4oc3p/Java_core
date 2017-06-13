package codewars;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by 4oc3p on 09.06.2017. Java_core
 */
public class RPS {

    private final static String PLAYER_1_WON = "Player 1 won!";
    private final static String PLAYER_2_WON = "Player 2 won!";

    public static String rps(String p1, String p2) {
        // your code
//        if (p1.equals(p2)) {
//            return "Draw!";
//        } else {
//            if (p1.equals("scissors")) {
//                return p2.equals("paper") ? PLAYER_1_WON : PLAYER_2_WON;
//            }
//            if (p1.equals("paper")) {
//                return p2.equals("rock") ? PLAYER_1_WON : PLAYER_2_WON;
//            }
//            if (p1.equals("rock")) {
//                return p2.equals("scissors") ? PLAYER_1_WON : PLAYER_2_WON;
//            }
//        }
//        return null;
        if (p1.equals(p2)) {
            return "Draw!";
        } else {
            switch (p1) {
                case "scissors":
                    return p2.equals("paper") ? PLAYER_1_WON : PLAYER_2_WON;
                case "paper":
                    return p2.equals("rock") ? PLAYER_1_WON : PLAYER_2_WON;
                case "rock":
                    return p2.equals("scissors") ? PLAYER_1_WON : PLAYER_2_WON;
            }
        }
        return null;
    }
}