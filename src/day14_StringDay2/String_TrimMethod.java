package day14_StringDay2;

public class String_TrimMethod {

	public static void main(String[] args) {

		String str = "      Hello         ";
		System.out.println(str.length());
		System.out.println(str);
		str = str.trim();
		
		System.out.println(str.length());
		
		String str2 = "      hello cohort16       ";
		System.out.println(str2);
		str2 = str2.trim();
        System.out.println(str2); //hello cohort16
		
	}

}
