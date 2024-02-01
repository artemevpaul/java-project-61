package hexlet.code;

import java.util.Scanner;

public class Calc {
    public static void calculate(String[] answer){
        System.out.println("Welcome to the Brain Games");
        System.out.print("May I have your name? ");
        Scanner scannerUsername = new Scanner(System.in);
        String userName = scannerUsername.next();
        System.out.println("Hello, " + userName + "!");
        var count = 0;
        Scanner scannerAnswer = new Scanner(System.in);
        while (count < 3) {
            int max = 1000, min = 1;
            int firstNumber = (min + (int) (Math.random() * ((max - min) + 1)));
            int secondNumber = (min + (int) (Math.random() * ((max - min) + 1)));
            String[] operations = {"+","-","*"};
            int randomOperation = (int) (Math.random() * operations.length);
            var operation = operations[randomOperation];
            var correctAnswer = 0;
            if (operation.equals("+")) {
                correctAnswer = firstNumber + secondNumber;
            } else if (operation.equals("-")) {
                correctAnswer = firstNumber - secondNumber;
            } else if (operation.equals("*")){
                correctAnswer = firstNumber * secondNumber;
            }

            System.out.print("What is the result of the expression? ");
            System.out.print("Question: " + firstNumber + " " + operation + " " + secondNumber +" ");
            int operationResult = scannerAnswer.nextInt();
            if (operation.equals("+") && operationResult == (firstNumber + secondNumber)){
                System.out.print("Correct!\n");
                count++;
            } else if (operation.equals("-") && operationResult == (firstNumber - secondNumber)){
                System.out.print("Correct!\n");
                count++;
            } else if (operation.equals("*") && operationResult == (firstNumber * secondNumber)) {
                System.out.print("Correct!\n");
                count++;
            } else {
                System.out.print(operationResult + " is wrong answer ;(. Correct answer was " + correctAnswer +" ");
                count = 0;
            }

        }
        System.out.print("Congratulations, " + userName + "!\n");
        scannerAnswer.close();
    }
}
