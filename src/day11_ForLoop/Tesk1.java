package day11_ForLoop;

public class Tesk1 {

	public static void main(String[] args) {

		//print Even Numbers;
		//Write a program that uses a for loop to print all Even numbers between 1 an 50;
		
				for (int  count =1; count < 51; count++) {
					if (count % 2==0) {
						System.out.print(count +" , ");
					}
					
					if (count % 10 == 0)
						System.out.println();
				}

			
		
	}

}
