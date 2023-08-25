package day06_Operators;

public class PEMDAS {

	public static void main(String[] args) {
  
		int a = 1;
		int b = 2;
		int c = 3;
		
		int result1 = a + b -c ;
		System.out.println(result1);
		
		 result1 = a + (b -c) ;
		System.out.println(result1);
		
		result1 = a + (b*c) ;
		System.out.println(result1);
		
		result1 = a + (b*c)/2 ;
		System.out.println(result1);
	}

}
