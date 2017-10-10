package codewars;

/**
 * Created by 4oc3p on 05.07.2017. Java_core
 */
public class Accumul {

    public static String accum(String s) {
        // your code
        String[] split = s.toLowerCase().split("");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < split.length; i++){
            for(int j = 0; j <= i; j++){
                if(j == 0) {
                    sb.append(split[i].toUpperCase());
                } else {
                    sb.append(split[i]);
                }
            }
            if(i == split.length - 1) break;
            sb.append("-");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(accum("ZpglnRxqenU"));
    }
}
