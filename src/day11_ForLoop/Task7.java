package day11_ForLoop;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		int a;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the month: ");
		
		a = scanner. nextInt();
		
		switch (a) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(" 31 Days in this Month");
			break;
		case 2:
			System.out.println(" 28 Days in tthis Month");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(" 30 Days in this Month");
			break;
			default:
				System.out.println(" Please enter valid month");
				
		}
		
			
		}
			
			
		
	}


