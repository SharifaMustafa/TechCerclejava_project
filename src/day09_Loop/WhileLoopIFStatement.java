package day09_Loop;

public class WhileLoopIFStatement {

	public static void main(String[] args) {

		int number = 1;
		while (number <= 7) {
			System.out.println(number);
			number ++;
		}
		
		if (number == 1) {
			System.out.println("Monday");
		}else if (number ==2) {
			System.out.println("Tuesday");
		}else if (number ==3) {
			System.out.println("Wednesday");

		}else if (number == 4) {
			System.out.println("Friday");
		}else if (number == 6) {
			System.out.println("Saturday");

		}else if (number == 7) {
			System.out.println("Sanday");

		}else {
			System.out.println("Invalid number of the day!");

		}
		
		
		
	}

}
