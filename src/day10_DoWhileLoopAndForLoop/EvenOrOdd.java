package day10_DoWhileLoopAndForLoop;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter a number");
		int num = keyboard.nextInt();
		if (num % 2 == 0) {
			System.out.println(num +" is a even number");
		}else {
			System.out.println(num +" is a odd number");
		}
	}

}
