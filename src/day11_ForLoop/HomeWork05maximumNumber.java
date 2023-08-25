package day11_ForLoop;

import java.util.Scanner;

public class HomeWork05maximumNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int maxNumber = 0;

		for (int i = 1; i <= 5; i++) {
			//System.out.println("Sharifa");
			System.out.print("Enter number " + i + ": ");
			int input = scanner.nextInt();

			if (input > maxNumber) {
				maxNumber = input;
			}
		}

		System.out.println("The maximum number is: " + maxNumber);

		scanner.close();
	}
}

  
  
















