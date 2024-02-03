package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {
    public static void findGCD() {
        final int max = 1000;
        final int min = 1;
        int firstNumber = (min + (int) (Math.random() * ((max - min) + 1)));
        int secondNumber = (min + (int) (Math.random() * ((firstNumber - min) + 1)));
        var a = firstNumber;
        var b = secondNumber;
        int correctAnswer = 0;
        while (b != 0) {
            var temp = b;
            b = a % b;
            a = temp;
            correctAnswer = a;
        }
        Engine.setCorrectAnswer(Integer.toString(correctAnswer));
        System.out.println("Find the greatest common divisor of given numbers.");
        System.out.println("Question: " + firstNumber + " " + secondNumber);
        Scanner scannerAnswer = new Scanner(System.in);
        System.out.println("Your answer: ");
        Engine.setUserAnswer(scannerAnswer.next());
        /* if (gcdAnswer == correctAnswer) {
            Engine.setRoundResult("win");
            Engine.setCount(Engine.getCount() + 1);
        } else {
            System.out.print("'" + gcdAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                    + correctAnswer + "'" + "\n");
            Engine.setRoundResult("lost");
            Engine.setCount(0);
        } */
    }
}
