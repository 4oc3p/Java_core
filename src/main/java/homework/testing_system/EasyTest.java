package homework.testing_system;


import java.util.Scanner;

/**
 * Created by 4oc3p on 16.04.2017. Java_core
 */
public class EasyTest extends TestBase {

    public EasyTest(Question[] questions, TestDifficulty difficulty, User user) {
        super(questions, difficulty);
        testing(user);
    }

    @Override
    public void testing(User user) {
        int i = 1;
        System.out.println("Easy test, answers only 'yes' or 'no'.");
        Scanner scanner = new Scanner(System.in);
        for (Question q : super.questions) {
            System.out.printf("Question %d: %s?. \n", i, q.getQuestion());
            String s = scanner.nextLine();
            if (q.getRightAnswer().equals(s)) {
                System.out.println("Right answer!");
                user.setCountRightAnswers(user.getCountRightAnswers() + 1);
            } else {
                System.out.println("Wrong. Next answer.");
            }
            i++;
        }

    }
}
