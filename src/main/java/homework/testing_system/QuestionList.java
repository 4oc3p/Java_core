package homework.testing_system;

import java.util.Arrays;

/**
 * Created by 4oc3p on 16.04.2017. Java_core
 */
public class QuestionList {
    private Question[] questionList;

    public Question[] getQuestionList() {
        return questionList;
    }

    public void addQuestion(Question... question) {
        Question temp[] = new Question[question.length];
        int i = 0;
        for (Question q : question) {
            temp[i++] = q;
        }
        this.questionList = temp;
    }

    @Override
    public String toString() {
        return "QuestionList{" +
                "questionList=" + Arrays.toString(questionList) +
                '}';
    }
}
