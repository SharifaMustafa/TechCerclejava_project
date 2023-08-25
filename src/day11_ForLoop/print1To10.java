package day11_ForLoop;

public class print1To10 {

	public static void main (String []args) {
		for (int count = 1; count <11; count++) {
			System.out.println(count);
		}
		
		
		// display 10 to 1;
		for (int count = 10; count >0; count --) {
			System.out.println(count);
		}
		
		// 1, 3, 5, 7, 9, 11, 13, 15;
		for (int count = 1; count <=15; count++) {
			if (count % 2 == 1) {
				System.out.println(count);
			}
		}
	}
}
