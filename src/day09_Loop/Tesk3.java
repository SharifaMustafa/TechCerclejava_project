package day09_Loop;

public class Tesk3 {

	public static void main(String[] args) {

		int result = 1;
		int factorialNumber = 5;
		while (factorialNumber >= 1) {
			result *= factorialNumber;
			factorialNumber--;

		}

		System.out.println(result);

	}

}
