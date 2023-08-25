package day15_StringTask;

public class ReversString {

	public static void main(String[] args) {

//		String word = "sharifa";
//		System.out.println(reverseString(word));
//		
//	}
//	public static String reverseString(String word) {
//		String reverse="";
//		
//		for (int i=word.length()-1; i>=0; i--){
//			reverse+=word.charAt(i);
//		}
//		return reverse;
		//            0123456
//		String str = "sharifa";
//		String reverse = "";
//		System.out.print(str.charAt(6));
//		System.out.print(str.charAt(5));
//		System.out.print(str.charAt(4));
//		System.out.print(str.charAt(3));
//		System.out.print(str.charAt(2));
//		System.out.print(str.charAt(1));
//		System.out.print(str.charAt(0));
		
		String str = "sharifa";
		String reverse = "";
		for (int i=str.length()-1; i>= 0; i--) {
			reverse += str.charAt(i);
			
		}
		System.out.println(reverse);
}

}
