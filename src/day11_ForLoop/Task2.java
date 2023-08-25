package day11_ForLoop;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Multiplication table of a given number");
		System.out.println("Please Enter a number");
		int y = keyboard.nextInt();
		
		for (int x = 1; x<=10; x++) {
			System.out.println(x + " x "+y+" = " + ( x * y));
		}
		

//		int y = 6;
//		for (int x = 1; x <= 10; x++) {
//			System.out.println(x + " x " + y + " = " + (x * y));
//		} 

	}

}
