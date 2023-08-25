package day11_ForLoop;

import java.util.Scanner;

public class HomeWork11GvenNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		boolean isPrime = checkPrime(number);

		if (isPrime) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}

		scanner.close();
	}

	public static boolean checkPrime(int n) {
		if (n <= 1) {
			return false; // Numbers less than or equal to 1 are not prime
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false; // Found a divisor, so it's not prime
			}
		}

		return true; // No divisors found, it's prime
	}
}
