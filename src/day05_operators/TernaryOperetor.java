package day05_operators;

public class TernaryOperetor {
	public static void main (String [] args) {
		
		int a , b ;
		a = 10 ;
		b = (a ==1) ? 20 : 30;
		System.out.println(b);
		
		b = (a >= 10) ? 50 : 100;
		 System.out.println(b);
		 
		 
		 //int num = 5;
		 //System.out.println(b);
		 
		 int num = 490;
		 System.out.println(num % 2);
		 
		 String evenOrOdd = (num % 2 == 0)? "even" : "Odd";
		 System.out.println(evenOrOdd);
		
		
	}

}
