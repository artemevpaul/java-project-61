package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {
    public static void generator() {
        int maxProgLength = 10;
        int minProgLength = 5;
        int progressionLength = minProgLength + (int) (Math.random() * ((maxProgLength - minProgLength) + 1));
        var newProgression = new String[progressionLength];
        var progressionBlankElement = (int) (Math.random() * progressionLength);
        var progressionDiff = (int) (Math.random() * progressionLength);
        var progressionStart = String.valueOf(minProgLength +
                (int) (Math.random() * ((maxProgLength - minProgLength) + 1)));
        newProgression[0] = progressionStart;
        for (var i = 1; i < progressionLength; i++) {
            newProgression[i] = String.valueOf(Integer.parseInt(newProgression[i - 1]) + progressionDiff);
        }
        var correctAnswer = newProgression[progressionBlankElement];
        newProgression[progressionBlankElement] = "..";
        StringBuilder progToCheck = new StringBuilder();
        for (int i = 0; i < newProgression.length; i++) {
            progToCheck.append(newProgression[i]);
            if (i < newProgression.length - 1) {
                progToCheck.append(" ");
            }
        }
        System.out.print("What number is missing in the progression? \n");
        System.out.print("Question: " + progToCheck + "\n");
        System.out.print("Your answer: ");
        Scanner scannerAnswer = new Scanner(System.in);
        String missingNumber = scannerAnswer.next();
        if (missingNumber.equals(correctAnswer)) {
            Engine.roundResult = "win";
            Engine.count++;
        } else {
            System.out.println("'" + missingNumber + "' is wrong answer ;(. Correct answer was '"
                    + correctAnswer + "'");
            Engine.roundResult = "lost";
            Engine.count = 0;
        }
    }
}