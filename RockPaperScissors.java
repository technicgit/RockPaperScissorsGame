package day4;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		System.out.println("Welcome to the Rock Paper Scissors game!");

		// User Input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("0. Rock, 1. Paper, 2. Scissors");
		int userChoice = scanner.nextInt();
		//System.out.println(userChoice);
		

		// Validate input = user's choice
		if (userChoice < 0 || userChoice > 2) {
			System.out.println("Invalid Choice. Please run the game again and enter 0, 1, or 2");
			scanner.close();
			return; // exit program

		}
		// Generate Computer's random choice between 0 and 2
		int computerChoice = new Random().nextInt(3); // It can generate random numbers between 0-2
		//System.out.println(computerChoice);

		// Determine winner

		// Tie
		if (userChoice == computerChoice) {
			System.out.println("Draw");
		}
		// Win
		else if ((userChoice == 0 && computerChoice == 2) || (userChoice == 1 && computerChoice == 0)
				|| (userChoice == 2 && computerChoice == 1)) {
			System.out.println("You win!");
		}
		// Lose
		else {
			System.out.println("Computer wins :c");
		}
		scanner.close();
	}

}
