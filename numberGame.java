/*this program is a simple number guessing game the only
difference being the player gets to pick the range.
The goal is to guess the correct number before you run out of turns

 */
import java.util.Random;
import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {
        //creating a new scanner and random from the java class
        Random randomNumber = new Random();
        Scanner sc = new Scanner(System.in);

        //all the variables
        int greatestNumber = 0;
        int guess = 0;

        //sets the number of turns as a random number from 2-6
        int countLimit = randomNumber.nextInt(2, 7);

        //instructions
        System.out.println("This is a guessing game where you have to guess " +
                "the number before you run out of guesses");
        System.out.println("You have " + countLimit + " guesses");

        //bbolean variable to check if greatestNumber is a ligitimate integer
        boolean validInt = false;

        //loop to check if greatestNumber is indeed a legitimate integer
        while (validInt != true){
            System.out.println("Please enter the greatest number you would like to guess: ");
            if (sc.hasNextInt()) {
                greatestNumber = sc.nextInt();
                validInt = true;
            }
            else {
                System.out.println("That is not a number. Please try again: ");
                sc.next();
            }
        }

        //this is the random number for the player to guess
        int answer = randomNumber.nextInt(greatestNumber);

        //the actual game
        while (answer != guess) {
            if (sc.hasNextInt()) {
                System.out.println("Please guess a number less than " + greatestNumber);
                if (guess < answer) {
                    System.out.println("Too low. Please try again: ");
                    guess = sc.nextInt();
                    countLimit--;
                    System.out.println("You hsve " + countLimit + " guesses left.");
                }
                if (guess > answer) {
                    System.out.println("Too high. Please try again: ");
                    guess = sc.nextInt();
                    countLimit--;
                    System.out.println("You hsve " + countLimit + " guesses left.");
                }
            }
            else if (countLimit == 0) {
                break;
            }
            else {
                System.out.println("That is not a number. Please try again: ");
                sc.next();
            }
        }
        if (countLimit == 0) {
            System.out.println("You didn't guess it in time. The number was " + answer);
        }
        else {
            System.out.println("Yippee. You did it.");
        }

    }

}
/*
while (!(sc.hasNextInt())) {
            System.out.println("That is not an integer. Please try again");
            lowestNumber = sc.nextInt();
        }

        System.out.println("Please guess a number between "
                + lowestNumber + " and " + greatestNumber);
        int guess = sc.nextInt();

        //check for type of input
        while (!(sc.hasNextInt())) {
            System.out.println("That is not an integer. Please try again");
            guess = sc.nextInt();
        }
 */
