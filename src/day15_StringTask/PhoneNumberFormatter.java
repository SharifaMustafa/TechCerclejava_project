package day15_StringTask;

import java.util.Scanner;

public class PhoneNumberFormatter {

	public static void main(String[] args) {

//		textString Formatting for Phone Numbers: 
//		Build a program that takes a string of digits 
//		representing a phone number and formats it into a 
//		more readable format (e.g.. " (123) 456-7890")

		String phoneNum = "2028766636";
		String part3 = phoneNum.substring(6);
		String part1 = phoneNum.substring(0, 3);
		String part2 = phoneNum.substring(3, 6);
		System.out.println("(" + part1 + ")" + " " + part2 + "-" + part3);

		String phoneNumber = "7031231234";

		String str1 = phoneNumber.substring(0, 3);
		String str2 = phoneNumber.substring(3, 6);
		String str3 = phoneNumber.substring(6);

		System.out.println("(" + str1 + ")" + " " + str2 + "-" + str3);

	}

}
