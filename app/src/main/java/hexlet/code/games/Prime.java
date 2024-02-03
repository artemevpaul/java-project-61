package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    public static void primeGame() {
        final int max = 50;
        final int min = 1;
        int numberToCheck = (min + (int) (Math.random() * ((max - min) + 1)));
        Engine.setCorrectAnswer("yes");
        if (numberToCheck < 2) {
            Engine.setCorrectAnswer("no");
        }
        for (var i = 2; i <= Math.sqrt(numberToCheck); i++) {
            if (numberToCheck % i == 0) {
                Engine.setCorrectAnswer("no");
                break;
            }
        }
        System.out.print("Answer 'yes' if given number is prime. Otherwise answer 'no'. \n");
        System.out.print("Question: " + numberToCheck + "\n");
        System.out.print("Your answer: ");
        Scanner scannerAnswer = new Scanner(System.in);
        Engine.setUserAnswer(scannerAnswer.next());
        /* if (isPrimeAnswer.equals(correctAnswer)) {
            Engine.setRoundResult("win");
            Engine.setCount(Engine.getCount() + 1);
        } else {
            System.out.println("'" + isPrimeAnswer + "' is wrong answer ;(. Correct answer was '"
                    + correctAnswer + "'");
            Engine.setRoundResult("lost");
            Engine.setCount(0);
        } */
    }
}
