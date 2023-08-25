package day11_ForLoop;

import java.util.Scanner;

public class HomeWork09SumOfDigits {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		int sum = calculateSumOfDigits(number);

		System.out.println("Sum of the digits: " + sum);

		scanner.close();
	}

	public static int calculateSumOfDigits(int n) {
		int sum = 0;

		while (n != 0) {
			sum += n % 10; // Add the last digit to the sum
			n /= 10; // Remove the last digit
		}

		return sum;
	}
}
