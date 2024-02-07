package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;



public class App {

    public static void main(String[] args) {
        System.out.print("Welcome to the Brain Games! \n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter. \n");
        System.out.print("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit \n");
        System.out.println("Your choice: ");
        String choice = scanner.next();

        switch (choice) {
            case "1" -> Cli.greet();
            case "2" -> Even.play();
            case "3" -> Calc.play();
            case "4" -> GCD.play();
            case "5" -> Progression.play();
            case "6" -> Prime.play();
            case "0" -> { }
            default -> System.out.println("Unknown game");
        }
    }
}
