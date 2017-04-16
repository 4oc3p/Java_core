package homework.testing_system;

import java.util.Arrays;

/**
 * Created by 4oc3p on 16.04.2017. Java_core
 */
public abstract class TestBase {
    protected Question[] questions;

    public TestBase(Question[] questions, TestDifficulty difficulty) {
        Question[] temp = new Question[0];
        for (Question question : questions) {
            if (question.getDifficulty().equals(difficulty)) {
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = question;
            }
        }
        this.questions = temp;
    }


    public static void startTest(TestDifficulty difficulty, QuestionList questionList, User user) {
        switch (difficulty) {
            case EASY:
                new EasyTest(questionList.getQuestionList(), difficulty, user);
                break;
            case HARD:
                new HardTest(questionList.getQuestionList(), difficulty, user);
                break;
        }
    }

    public abstract void testing(User user);
}
