package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    public static void calculate() {
            Scanner scannerAnswer = new Scanner(System.in);
            final int max = 1000;
            final int min = 1;
            int firstNumber = (min + (int) (Math.random() * ((max - min) + 1)));
            int secondNumber = (min + (int) (Math.random() * ((max - min) + 1)));
            String[] operations = {"+", "-", "*"};
            int randomOperation = (int) (Math.random() * operations.length);
            var operation = operations[randomOperation];
            var correctAnswer = switch (operation) {
                case "+" -> firstNumber + secondNumber;
                case "-" -> firstNumber - secondNumber;
                case "*" -> firstNumber * secondNumber;
                default -> 0;
            };
            Engine.setCorrectAnswer(Integer.toString(correctAnswer));
            System.out.print("What is the result of the expression? \n");
            System.out.print("Question: " + firstNumber + " " + operation + " " + secondNumber + " \n");
            System.out.print("Your answer: ");
            Engine.setUserAnswer(scannerAnswer.next());
            /*if (operation.equals("+") && operationResult == (firstNumber + secondNumber)) {
                Engine.setRoundResult("win");
                Engine.setCount(Engine.getCount() + 1);
            } else if (operation.equals("-") && operationResult == (firstNumber - secondNumber)) {
                Engine.setRoundResult("win");
                Engine.setCount(Engine.getCount() + 1);
            } else if (operation.equals("*") && operationResult == (firstNumber * secondNumber)) {
                Engine.setRoundResult("win");
                Engine.setCount(Engine.getCount() + 1);
            } else {
                System.out.print("'" + operationResult + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + correctAnswer + "'" + " ");
                Engine.setRoundResult("lost");
                Engine.setCount(0);
            } */
    }
}
