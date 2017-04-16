package homework.testing_system;

import java.util.Arrays;

/**
 * Created by 4oc3p on 16.04.2017. Java_core
 */
public class QuestionList {
    private Question[] questionList = new Question[0];

    public Question[] getQuestionList() {
        return questionList;
    }

    public void setQuestionList(Question[] questionList) {
        this.questionList = questionList;
    }

    public void addQuestion(Question... question) {
        for (Question q : question) {
            Question temp[] = Arrays.copyOf(this.questionList, this.questionList.length + 1);
            temp[temp.length - 1] = q;
            this.questionList = temp;
        }

    }

    @Override
    public String toString() {
        return "QuestionList{" +
                "questionList=" + Arrays.toString(questionList) +
                '}';
    }
}
