package homework.nlp_test;

import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;

import java.io.*;
import java.util.Scanner;

/**
 * Created by 4oc3p on 05.04.2017. Java_core
 */
public class Nlp {
    private static String buildStringFromFile(InputStream file) {
        Scanner scanner = new Scanner(file);
        StringBuilder s = new StringBuilder();
        while (scanner.hasNextLine()) {
            s.append(scanner.nextLine());
            s.append("\n");
        }
        return s.toString();
    }

    private static String[] sentenceDetection(String s) {
        String sentences[] = new String[0];
        try (InputStream modelIn = new FileInputStream("C:\\en-sent.bin")) {
            SentenceModel model = new SentenceModel(modelIn);
            SentenceDetectorME sentenceDetector = new SentenceDetectorME(model);
            sentences = sentenceDetector.sentDetect(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sentences;
    }

    public static int numberOfSentencesInText(String fileLoc) throws FileNotFoundException {
        String string = buildStringFromFile(makeInputStream(fileLoc));
        String[] sentences = sentenceDetection(string);
        return sentences.length;
    }

    public static void printSentencesOfText(String fileLoc) throws FileNotFoundException {
        String string = buildStringFromFile(makeInputStream(fileLoc));
        String[] sentences = sentenceDetection(string);
        for (String sent : sentences) {
            System.out.println(sent);
        }
    }


    private static InputStream makeInputStream(String fileLoc) throws FileNotFoundException {
        File f = new File(fileLoc);
        return new FileInputStream(f);
    }
}
