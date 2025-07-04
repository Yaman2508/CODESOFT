
    import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int totalScore = 0;
        int round = 1;

        System.out.println("Welcome to the Number Guessing Game!");

        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = 27;// 27 no. to guess
            int maxAttempts = 4;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nRound " + round + ": Guess the number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println(" Correct! You guessed the number in " + attempts + " attempts.");
                    totalScore += (maxAttempts - attempts + 1); // More points for fewer attempts
                    guessedCorrectly = true;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println(" Sorry! You've used all attempts. The number was: " + numberToGuess);
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            sc.nextLine(); // Consume newline
            String answer = sc.nextLine().trim().toLowerCase();
            playAgain = answer.equals("yes");

            round++;
        }

        System.out.println("\nThanks for playing!");
        System.out.println(" Your total score: " + totalScore);
        sc.close();
    }
}

    


