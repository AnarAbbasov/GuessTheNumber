import java.util.Scanner;

import java.util.Random;




public class GuessTheNumber {




    public static void main (String[] args) {
        Random rand = new Random();
        int guessed = rand.nextInt(20);
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Hello what is your name");
        boolean win=false;
        String userName = myscanner.nextLine();
        System.out.println("Well " + userName + " I am thinking of number between 1 and 20.");
        System.out.println("Well " + userName + " Take a quess.");
        String quess = myscanner.nextLine();
        int quess_counter=0;
        String game_continue="y";
        //System.out.println(guessed);
        while (quess_counter<6 && game_continue.compareTo("y")==0) {
            if (guessed == Integer.valueOf(quess)) {
                System.out.println("Good job, " + userName + " You quessed my number in " + quess_counter + " guesses!");
                System.out.println("Would you like to play again?(y or n)");
                game_continue = myscanner.nextLine();
                if (game_continue.compareTo("n")==0){
                return;}
                System.out.println("Well " + userName + " I am thinking of number between 1 and 20.");
                System.out.println("Well " + userName + " Take a quess.");
                guessed = rand.nextInt(20);
                //System.out.println(guessed);
            }

            if (guessed > Integer.valueOf(quess) && win==false) {
                System.out.println("Your guess is too low");
                quess_counter++;
                win=false;
                System.out.println("Take a guess");

            }
            if (guessed < Integer.valueOf(quess)&& win==false ) {
                quess_counter++;
                win=false;
                System.out.println("Your guess is too high");
                System.out.println("Take a guess");
            }
              quess = myscanner.nextLine();
        }

    }
}
