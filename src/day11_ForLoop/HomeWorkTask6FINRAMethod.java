package day11_ForLoop;

public class HomeWorkTask6FINRAMethod {

	public static void main(String[] args) {
		printFINRA();
	}

	public static void printFINRA() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print("FINRA ");
			} else if (i % 3 == 0) {
				System.out.print("FIN ");
			} else if (i % 5 == 0) {
				System.out.print("RA ");
			} else {
				System.out.print(i + " ");
			}
		}
	}
}
