package day11_ForLoop;

import java.util.Scanner;

public class Randam {
	
	public static void main (String [] args) {
		
		
		Randam re = new Randam();
		int winningNumber = re.nextInt(5)+1;
		int score = 0;
		Scanner sc = new Scanner (System.in);
		int input;
		do {
			System.out.println("guess number between 1-5");
			input = sc.nextInt();
			score++;
		}while (input != winningNumber);
		System.out.println("Congratulations!");
		System.out.println("you guessed " + score +" tome");
				
	}

	private int nextInt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
