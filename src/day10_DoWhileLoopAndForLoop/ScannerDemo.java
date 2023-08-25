package day10_DoWhileLoopAndForLoop;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("What is you name?");
		
		String name = keyboard.next();
		
		System.out.println("Hello"+name);
		
		System.out.println("How old are you?");
		int age = keyboard.nextInt();
		System.out.println(name +" is "+age+" old .");
		
		keyboard.close();
		
	}

}
