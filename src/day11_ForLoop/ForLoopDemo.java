package day11_ForLoop;

public class ForLoopDemo {

	public static void main(String[] args) {

		for ( int i = 1; i<6; i++) {
			System.out.println("Hello Cohort16---"+i);
		}
		
		int i = 1;
		while (i < 6) {
			System.out.println("Hello Cohort16----"+i);
			i++;
		}
		
		i = 1;
		do {
			System.out.println("Hello Cohort16------" + i);
			i++;
		}while(i < 6);
		
		for (int count = 1; count < 3; count ++) {
			System.out.println(count);
		}
	}
	

}
