package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    public static void primeGame() {
        int max = 50, min = 1;
        int numberToCheck =(min + (int) (Math.random() * ((max - min) + 1)));
        var correctAnswer = "yes";
        if (numberToCheck<2) {
            correctAnswer = "no";
        }
        for (var i = 2; i <= Math.sqrt(numberToCheck); i++) {
            if (numberToCheck % i == 0) {
                correctAnswer = "no";
                break;
            }
        }
        System.out.print("Answer 'yes' if given number is prime. Otherwise answer 'no'. \n");
        System.out.print("Question: " + numberToCheck + "\n");
        System.out.print("Your answer: ");
        Scanner scannerAnswer = new Scanner(System.in);
        String isPrimeAnswer = scannerAnswer.next();
        if (isPrimeAnswer.equals(correctAnswer)) {
            Engine.roundResult = "win";
            Engine.count++;
        } else {
            System.out.println("'" + isPrimeAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
            Engine.roundResult = "lost";
            Engine.count = 0;
        }
    }
}
