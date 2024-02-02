package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.isEven;

import java.util.Scanner;

public class Engine {
    public static String userName;
    public static int count = 0;
    public static String roundResult = "";
    public static void greet() {
        System.out.println("Welcome to the Brain Games");
        System.out.print("May I have your name? ");
        Scanner scannerUsername = new Scanner(System.in);
        userName = scannerUsername.next();
        System.out.println("Hello, " + userName + "!");
        //scannerUsername.close();
    }

    public static void userComms(){
        switch (roundResult) {
            case "win":
                System.out.println("Correct!");
                break;
            case "lost":
                break;
        }

        if (count == 0) {
            System.out.print("\nLet's try again, " + Engine.userName + "!\n");
            System.exit(0);
        } else if (count == 3) {
            System.out.print("Congratulations, " + Engine.userName + "!\n");
        }
    }
    public static void gameLoop() {
        while (count < 3) {
            if (App.gameName.equals("2")) {
                isEven.checkEven();
                Engine.userComms();
            } else if(App.gameName.equals("3")) {
                Calc.calculate();
                Engine.userComms();
            } else if (App.gameName.equals("4")) {
                GCD.findGCD();
                Engine.userComms();
            } else if (App.gameName.equals("5")){
                Progression.generator();
                Engine.userComms();
            }
        }
    }
}