package day11_ForLoop;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkNumberGuessingGame {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.print("Enter your name: ");
		String playerName = scanner.nextLine();

		System.out.println("Welcome, " + playerName + "!");

		System.out.println("Select a difficulty level:");
		System.out.println("1. Easy (1-10)");
		System.out.println("2. Medium (1-25)");
		System.out.println("3. Hard (1-100)");
		System.out.print("> ");
		int level = scanner.nextInt();

		int maxRange = 0;

		switch (level) {
		case 1:
			maxRange = 10;
			break;
		case 2:
			maxRange = 25;
			break;
		case 3:
			maxRange = 100;
			break;
		default:
			System.out.println("Invalid level selection. Defaulting to medium.");
			maxRange = 25;
		}

		int winningNumber = random.nextInt(maxRange) + 1;
		int numberOfGuesses = 0;

		System.out.println("Guess a number between 1 and " + maxRange);

		while (true) {
			System.out.print("> ");
			int guess = scanner.nextInt();
			numberOfGuesses++;

			if (guess < 1 || guess > maxRange) {
				System.out.println("Invalid number. Please try again.");
			} else if (guess < winningNumber) {
				System.out.println(guess + " is lower than the winning number. Please try again.");
			} else if (guess > winningNumber) {
				System.out.println(guess + " is greater than the winning number. Please try again.");
			} else {
				System.out.println("Congrats, " + playerName + "!");
				System.out.println("The winning number is " + winningNumber);
				System.out.println("You guessed it in " + numberOfGuesses + " tries.");
				break;
			}
		}

		scanner.close();
	}

}
