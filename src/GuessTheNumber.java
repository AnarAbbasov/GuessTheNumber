import java.util.Scanner;

import java.util.Random;




public class GuessTheNumber {




    public static void main (String[] args) {
        Random rand = new Random();
        int guessed = rand.nextInt(20);
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Hello what is your name");

        String userName = myscanner.nextLine();
        System.out.println("Well " + userName + " I am thinking of number between 1 and 20.");
        System.out.println("Well " + userName + " Take a quess.");
        String quess = myscanner.nextLine();
        int quess_counter=0;
        System.out.println(guessed);
        while (quess_counter<6) {
            if (guessed == Integer.valueOf(quess)) {
                System.out.println("Good job, " + userName + " You quessed my number in " + quess_counter + " guesses!");
                return;

            }

            if (guessed > Integer.valueOf(quess) ) {
                System.out.println("Your guess is too low");
                quess_counter++;
                System.out.println("Take a guess");

            }
            if (guessed < Integer.valueOf(quess) ) {
                quess_counter++;
                System.out.println("Your guess is too high");
                System.out.println("Take a guess");
            }
              quess = myscanner.nextLine();
        }

    }
}
