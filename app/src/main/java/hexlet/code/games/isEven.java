package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;

public class isEven {
    public static void checkEven() {
        if (Engine.count == 0) {
            Engine.greet();
        }
        int max = 1000, min = 1;
        int numberToCheck = (min + (int) (Math.random() * ((max - min) + 1)));
        System.out.print("Answer 'yes' if the number is even, otherwise answer 'no'. \n");
        System.out.print("Question: " + numberToCheck + "\n");
        System.out.print("Your answer: ");
        Scanner scannerAnswer = new Scanner(System.in);
        String isEvenAnswer = scannerAnswer.next();
        String correctAnswer;
        if (numberToCheck % 2 == 0){
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
            if (isEvenAnswer.equals(correctAnswer)){
                Engine.roundResult = "win";
                Engine.count++;
            } else if(!isEvenAnswer.equals(correctAnswer)){
                System.out.print("'" + isEvenAnswer+ "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'" + "\n");
                Engine.roundResult = "lost";
                Engine.count = 0;
            }
    }
}
