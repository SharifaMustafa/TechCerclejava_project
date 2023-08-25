package day11_ForLoop;

import java.util.Scanner;

public class HomeWorkTask7FactorialCalculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		long factorial = calculateFactorial(number);

		System.out.println(number + "! = " + factorial);

		scanner.close();
	}

	public static long calculateFactorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * calculateFactorial(n - 1);
		}

	}

}
