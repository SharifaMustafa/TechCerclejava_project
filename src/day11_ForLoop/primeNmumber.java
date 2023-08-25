package day11_ForLoop;

import java.util.Random;
import java.util.Scanner;

public class primeNmumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Pick a number");

		boolean isPrime = true;

		int input = scan.nextInt();

		for (int i = 2; i < input; i++) {

			if (input % i == 0) {
				isPrime = false;
			}

		}

		if (isPrime) {
			System.out.println("its a prime number");
		} else {
			System.out.println("its not a prime number");
		}

		scan.close();

	}
}
