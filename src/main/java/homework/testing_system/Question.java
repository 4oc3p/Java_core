package homework.testing_system;

import java.util.Arrays;

/**
 * Created by 4oc3p on 16.04.2017. Java_core
 */
public class Question {
    private String question;
    private String[] variantsOfAnswer;
    private String rightAnswer;
    private int rightAnswerForHard;
    private TestDifficulty difficulty;

    public Question(String question, String rightAnswer) {
        this.question = question;
        this.rightAnswer = rightAnswer;
        this.difficulty = TestDifficulty.EASY;
    }

    public Question(String question, int rightAnswerForHard, String ... variantsOfAnswer) {
        this.question = question;
        this.rightAnswerForHard = rightAnswerForHard;
        this.difficulty = TestDifficulty.HARD;
        this.variantsOfAnswer = new String[variantsOfAnswer.length];
        int a = 0;
        for (String s : variantsOfAnswer) {
            this.variantsOfAnswer[a++] = s;
        }
    }

    public String getQuestion() {
        return question;
    }

    public String[] getVariantsOfAnswer() {
        return variantsOfAnswer;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public int getRightAnswerForHard() {
        return rightAnswerForHard;
    }

    public TestDifficulty getDifficulty() {
        return difficulty;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", variantsOfAnswer=" + Arrays.toString(variantsOfAnswer) +
                ", rightAnswer='" + rightAnswer + '\'' +
                ", rightAnswerForHard=" + rightAnswerForHard +
                ", difficulty=" + difficulty +
                '}';
    }
}
