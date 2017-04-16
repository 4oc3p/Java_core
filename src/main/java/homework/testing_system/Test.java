package homework.testing_system;


/**
 * Created by 4oc3p on 16.04.2017. Java_core
 */
public class Test {
    public static void main(String[] args) {
        Question q1 = new Question("4>2", "yes");
        Question q2 = new Question("4<2", "no");
        Question q3 = new Question("Java is: ", 2,
                "1. Qwe", "2. Programming language", "3. Foobar");
        QuestionList questionList = new QuestionList();
        questionList.addQuestion(q1, q2, q3);

        User user1 = new User("Valera");

        user1.startTest(TestDifficulty.EASY, questionList);
        user1.startTest(TestDifficulty.HARD, questionList);

    }
}
