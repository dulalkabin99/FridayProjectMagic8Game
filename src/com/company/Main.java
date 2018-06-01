package com.company;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String go;
        QstonAns();
        go = keyboard.nextLine();
        //check if use enters Yes and continues
        while (go.equals("y") || go.equals("Y")) {
            QstonAns();
            go = keyboard.nextLine();

        }
        System.out.println("Thank you for Playing the game, Please come back and play again ");
    }

    public static void QstonAns() {
        Scanner keyboard = new Scanner(System.in);
        Random generate = new Random();
        String question;
        // Creating array of answers
        String[] answers = {
                "    It is certain",
                "    It is decidedly so",
                "    Without a doubt",
                "    Yes definitely",
                "    You may rely on it",
                "    As I see it",
                "    yes",
                "    Most likely",
                "    Outlook good", "Yes",
                "    Signs point to yes",
                "    Reply hazy try again",
                "    Ask again later",
                "    Better not tell you now",
                "    Cannot predict now",
                "    Concentrate and ask again",
                "    Don't count on it",
                "    My reply is no",
                "    My sources say no",
                "    Outlook not so good",
                "    Very doubtful"
        };

        //starting the program
        System.out.println("Enter Your Question: ");
        question = keyboard.nextLine();
        System.out.println("YOU ASKED:  " + question);
        System.out.println("MAGIC 8-BALL SAYS:" + answers[generate.nextInt(20)]);
            // asking if it wants to continues the game
        System.out.println("Do you have another question for the Magic 8-Ball? (y/n)");

    }
}

