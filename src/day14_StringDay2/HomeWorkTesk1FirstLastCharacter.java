package day14_StringDay2;

import java.util.Scanner;

public class HomeWorkTesk1FirstLastCharacter {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		String sentence = scanner.nextLine();

		if (!sentence.isEmpty()) {
			char firstCharacter = sentence.charAt(0);
			char lastCharacter = sentence.charAt(sentence.length() - 1);

			System.out.println("First character: " + firstCharacter);
			System.out.println("Last character: " + lastCharacter);
		} else {
			System.out.println("Input sentence is empty.");
		}
	}
}
