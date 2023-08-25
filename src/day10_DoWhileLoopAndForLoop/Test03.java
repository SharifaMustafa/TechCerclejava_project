package day10_DoWhileLoopAndForLoop;

public class Test03 {

	public static void main(String[] args) {

		int count = 1;
		do {
			if (count % 3 == 0) {
				System.out.print(count + " , ");
			}
			count++;

		} while (count <= 100);
		
		
		System.out.println("-------------------------");
		
		count = 1;
		do {
			if (count % 5 == 0) {
				System.out.print(count + " , ");
				
			}
			count ++;
		}while (count <= 100);
		
		
		System.out.println("-------------------");
		
		count = 1;
		do {
			if (count % 5 == 0 && count % 3 == 0) {
				System.out.print(count + " , ");
			}
			count ++;
		}while (count <+100);
		

	}
}
