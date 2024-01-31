package hexlet.code;

import java.util.Scanner;

public class isEven {
    public static void checkEven(String[] answer) {
        System.out.println("Welcome to the Brain Games");
        System.out.print("May I have your name? ");
        Scanner scannerUsername = new Scanner(System.in);
        String userName = scannerUsername.next();
        System.out.println("Hello, " + userName + "!");
        var count = 0;
        Scanner scannerAnswer = new Scanner(System.in);
        while (count < 3) {
            int max = 10000000, min = 1;
            int numberToCheck = (min + (int) (Math.random() * ((max - min) + 1)));
            System.out.print("Answer 'yes' if the number is even, otherwise answer 'no'. \n");
            System.out.print("Question: " + numberToCheck + "\n");
            System.out.print("Your answer: ");
            String isEvenAnswer = scannerAnswer.next();
            if (isEvenAnswer.equals("yes") && numberToCheck % 2 == 0) {
                System.out.print("Correct!\n");
                count++;

            } else if (isEvenAnswer.equals("no") && numberToCheck % 2 == 0) {
                System.out.print("'no' is wrong answer ;(. Correct answer was 'yes'.\n");
                count = 0;

            } else if (isEvenAnswer.equals("yes") && numberToCheck % 2 != 0) {
                System.out.print("'yes' is wrong answer ;(. Correct answer was 'no'.\n");
                count = 0;

            } else if (isEvenAnswer.equals("no") && numberToCheck % 2 != 0) {
                System.out.print("Correct!\n");
                count++;

            } else if (!isEvenAnswer.equals("no") && !isEvenAnswer.equals("yes")) {
                System.out.print(isEvenAnswer + " is incorrect\n");
                count = 0;
            }
        }
        System.out.print("Congratulations, " + userName + "!\n");
        scannerAnswer.close();
    }
}
