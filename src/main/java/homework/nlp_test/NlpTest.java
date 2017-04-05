package homework.nlp_test;

import java.io.*;


/**
 * Created by 4oc3p on 05.04.2017. Java_core
 */
public class NlpTest {
    public static void main(String[] args) throws IOException {
        String fileLocation = "G:\\text.txt";
        System.out.println(Nlp.numberOfSentencesInText(fileLocation));
        Nlp.printSentencesOfText(fileLocation);
    }


}
