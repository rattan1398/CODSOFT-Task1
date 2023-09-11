import java.util.Random;

public class Guessing {

    public static void main(String[] args) {
        // Generate a random number that is between 1 to 100.
        Random random = new Random();
        int n = random.nextInt(100) + 1;

        // The user guesses number here.
        System.out.println("Can you guess the number between 1 to 100 for me?");

        // Get the user's guess.
        int guess = Integer.parseInt(System.console().readLine());

        // Compare the user's guess with the generated number.
        while (guess != n) {
            if (guess < n) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
            guess = Integer.parseInt(System.console().readLine());
        }

        // If user guesses the correct number!
        System.out.println("Congratulations! You guessed the number.");
    }
}
