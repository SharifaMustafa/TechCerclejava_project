package day11_ForLoop;

public class HomeWork15PatternGenerator {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			// Print spaces
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}

			// Print numbers
			for (int k = 1; k <= i; k++) {
				System.out.print(i);
			}

			System.out.println();
		}
	}
}
