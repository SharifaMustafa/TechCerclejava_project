package day15_StringTask;

public class Palindrome {

	public static void main(String[] args) {
//      Palindrome Checker: 
//      Create a program that checks if a given string is a
//      palindrome (reads the same forwards and backwards).
      
      // civic, level , hannah
      // 1. reverse the string
      // 2. compare reversed string with original string

		String str = "hannah";
		String reverse ="";
		for (int i=str.length()-1; i>=0; i--) {
			reverse += str.charAt(i);
		}
		System.out.println(reverse);
		
		
		
		
		
//		
//		String str = "sharifa";
//		String reverse = "";
//		for (int i=str.length()-1; i>= 0; i--) {
//			reverse += str.charAt(i);
//			
//		}
//		System.out.println(reverse);
//}
		
	}

}
