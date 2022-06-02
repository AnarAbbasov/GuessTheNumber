import java.util.Scanner;


public class GuessTheNumber {




    public static void main (String[] args)
    {
        Scanner myscanner=new Scanner(System.in);
   System.out.println("Hello what is your name");

   String userName = myscanner.nextLine();
   System.out.println("Well "+userName+" I am thinking of number between 1 and 20.");
   System.out.println("Well "+userName+" Take a quess.");
   String quess = myscanner.nextLine();
        System.out.println("Your quess is too high");
    }
}
