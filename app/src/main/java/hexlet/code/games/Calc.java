package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    public static void calculate(){
            Scanner scannerAnswer = new Scanner(System.in);
            int max = 1000, min = 1;
            int firstNumber = (min + (int) (Math.random() * ((max - min) + 1)));
            int secondNumber = (min + (int) (Math.random() * ((max - min) + 1)));
            String[] operations = {"+","-","*"};
            int randomOperation = (int) (Math.random() * operations.length);
            var operation = operations[randomOperation];
            var correctAnswer = switch (operation) {
                case "+" -> firstNumber + secondNumber;
                case "-" -> firstNumber - secondNumber;
                case "*" -> firstNumber * secondNumber;
                default -> 0;
            };
            System.out.print("What is the result of the expression? ");
            System.out.print("Question: " + firstNumber + " " + operation + " " + secondNumber +" ");
            System.out.print("Your answer: ");
            int operationResult = scannerAnswer.nextInt();
            if (operation.equals("+") && operationResult == (firstNumber + secondNumber)){
                Engine.roundResult = "win";
                Engine.count++;
            } else if (operation.equals("-") && operationResult == (firstNumber - secondNumber)){
                Engine.roundResult = "win";
                Engine.count++;
            } else if (operation.equals("*") && operationResult == (firstNumber * secondNumber)) {
                Engine.roundResult = "win";
                Engine.count++;
            } else {
                System.out.print("'" + operationResult + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'" +" ");
                Engine.roundResult = "lost";
                Engine.count = 0;
            }
    }
}
