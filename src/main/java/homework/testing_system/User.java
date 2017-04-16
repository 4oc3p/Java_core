package homework.testing_system;


/**
 * Created by 4oc3p on 16.04.2017. Java_core
 */
public class User {
    private static int id;
    private String name;
    private int countRightAnswers;

    public User(String name) {
        this.name = name;
        id++;
    }

    public static int getId() {
        return id;
    }


    public int getCountRightAnswers() {
        return countRightAnswers;
    }

    public void setCountRightAnswers(int countRightAnswers) {
        this.countRightAnswers = countRightAnswers;
    }

    public void startTest(TestDifficulty difficulty, QuestionList questionList) {
        TestBase.startTest(difficulty, questionList, this);
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "User{" +
                "ID='" + id + '\'' +
                ", name='" + name + '\'' +
                ", countRightAnswers=" + countRightAnswers +
                '}';
    }
}
