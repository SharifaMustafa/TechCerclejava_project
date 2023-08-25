package day10_DoWhileLoopAndForLoop;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {

		Random1 random = new Random1 ();
		System.out.println(random . nextInt (10));
		
		System.out.println(random.nextBoolean());
		
		System.out.println(random.nextInt(100)*(-1));
		
		int secretNumber=random.nextInt(100);
	    System.out.println(secretNumber);
	
	}
	
	

}
