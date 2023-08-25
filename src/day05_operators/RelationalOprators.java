package day05_operators;

public class RelationalOprators {
	
	public static void main (String []args) {
		
		// == , > , >= , < , <= , != 
		// RelationalOperator will return boolean
		
		int a = 2;
		int b = 3;
		int c = 5;
		
		System.out.println(a == b);
		
		int  d = a+b;
		
		System.out.println(d == c);
		boolean result = a + b == c;
		
		System.out.println(result);
		
		
		// != not equal
		
		System.out.println(a != b);
		System.out.println(d != c);
		
		
		
		
		
		
		// a = 
	 a = 1 ;
     b = 2 ;
	 c = 3 ;
	 
	 System.out.println(a >= b);
	 System.out.println(a + b >= c);
	 
	 boolean result2 = a <= c ;
	 System.out.println(result2);
	 
	 System.out.println(a * b >= c);
	 
	 System.out.println(a + b +c < c + b);
	 
	 System.out.println(a + b +c <= c * b);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		
	}

}
