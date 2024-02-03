package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    public static void checkEven() {
        final int max = 1000;
        final int min = 1;
        int numberToCheck = (min + (int) (Math.random() * ((max - min) + 1)));
        System.out.print("Answer 'yes' if the number is even, otherwise answer 'no'. \n");
        System.out.print("Question: " + numberToCheck + "\n");
        System.out.print("Your answer: ");
        Scanner scannerAnswer = new Scanner(System.in);
        String isEvenAnswer = scannerAnswer.next();
        String correctAnswer;
        if (numberToCheck % 2 == 0) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        if (isEvenAnswer.equals(correctAnswer)) {
            Engine.setRoundResult("win");
            Engine.setCount(Engine.getCount() + 1);
        } else {
            System.out.println("'" + isEvenAnswer + "' is wrong answer ;(. Correct answer was '"
                    + correctAnswer + "'");
            Engine.setRoundResult("lost");
            Engine.setCount(0);
        }
    }
}
