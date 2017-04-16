package homework.testing_system;

import java.util.Scanner;

/**
 * Created by 4oc3p on 16.04.2017. Java_core
 */
public class HardTest extends TestBase {

    public HardTest(Question[] questions, TestDifficulty difficulty, User user) {
        super(questions, difficulty);
        testing(user);
    }

    @Override
    public void testing(User user) {
        int questionCounter = 1;
        System.out.println("Hard test, you need to choose one of the answers");
        Scanner scanner = new Scanner(System.in);
        for (Question q : super.questions) {
            System.out.printf("Question %d. %s?:\n", questionCounter, q.getQuestion());
            for (String s : q.getVariantsOfAnswer()) {
                System.out.println(s);
            }
            int userAnswer = scanner.nextInt();
            if (q.getRightAnswerForHard() == userAnswer) {
                System.out.println("Right answer!");
                user.setCountRightAnswers(user.getCountRightAnswers() + 1);
            } else {
                System.out.println("Wrong. Next answer.");
            }
            questionCounter++;
        }

    }
}
