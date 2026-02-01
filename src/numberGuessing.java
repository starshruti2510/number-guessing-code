import java.util.Scanner;
import java.util.Random;

public class numberGuessing {
    public static void main(String[] args) {
        //Declaring scanner and random
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        int playAgain;

        //Intro of the Game
        System.out.println("\nWelcome to the Number Guessing Game!!");
        System.out.println("Try to guess the number which is taken by computer!!");
        System.out.println("Hints will be provided if number is not correct!!");

        do{
            int guessTheNumber = rm.nextInt(100) + 1; //Number is between 1 to 100
            int user = 0;
            int attempts = 0;
            int maxAttempts = 10;   //Maximum attempts are 10

            System.out.println("\nNumber has chosen between 1 to 100!!");
            System.out.println("You have " + maxAttempts + " attempts to guess the number!!!");

            //loop to check the number
            while(user != guessTheNumber && attempts < maxAttempts) {
                System.out.println("\nEnter your number which you have guessed: ");
                user = sc.nextInt();    
                attempts++;

                if(user < guessTheNumber) {
                    System.out.println("Your number is low!! Try the higher number.");
                } else if(user > guessTheNumber) {
                    System.out.println("Your number is high!! Try the lower number.");
                } else {
                    System.out.println("Congratulations!! You win!!... Computer lost!!");
                    break;
                }

                //checking how many attempts left
                int remaining = maxAttempts - attempts;
                if(remaining > 0) {
                    System.out.println("Attempts left: " + remaining + "\n");
                } else {
                    System.out.println("You lost!!... Computer Win!!");
                }
            }

            //asking user if they want to play again.
            System.out.println("Want to play again?? Choose 1 or 2:");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.println("Enter your choice: ");
            playAgain = sc.nextInt();
            System.out.println();

        } while(playAgain == 1);        //If user choice is 1 then the game will start again.

        System.out.println("It's nice to play with you!! Thank you!!");
        sc.close();         //game end
    }
}