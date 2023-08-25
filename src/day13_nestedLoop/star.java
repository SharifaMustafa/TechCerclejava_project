package day13_nestedLoop;

public class star {

	public static void main(String[] args) {

		for (int i=5; i>=1; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	//  *
	//  **
	//  ***
	//  ****
	//  *****

			for (int i = 0; i < 15; i++) {
				// System.out.println("*****");
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();

			}

			for (int i = 0; i < 30; i++) {
				// System.out.println("*****");
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();

			}
	}
}

//	      *****
//	      ****
//	      ***
//	      **
//	      *
