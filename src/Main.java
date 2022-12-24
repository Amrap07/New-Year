import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(10);
        int numberOfTries =3;
        Scanner scanner = new Scanner(System.in);
        int guess;
        boolean win = false;
        System.out.println("I guessed number between 1 and 10");
        while (win == false) {
            System.out.println("Type your number:");
            guess = scanner.nextInt();
            numberOfTries = 3;
            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too high");
            }
        }
            System.out.println("Yes! You are a winner");
            System.out.println("The number was:" + numberToGuess);
            System.out.println("The number of tries:" + numberOfTries);

        }
    }


