package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void runGame(String[][] gameData, String gameRules) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(gameRules);

        for (String[] roundData : gameData) {
            String question = roundData[0];
            String correctAnswer = roundData[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again!");
                return;
            }
        }

        System.out.println("Congratulations!");
    }
}

