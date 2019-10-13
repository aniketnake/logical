package Oct_thirteen;

import java.util.Scanner;

public class SeparateAlphanumeric {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Alphanumeric String");
		String input = scn.next();

		String number = "";
		String letter = "";

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				number = number + ch;
			} else {
				letter = letter + ch;
			}
		}//for
		System.out.println("Alphabate  " + letter);
		System.out.println("numbers  " + number);
	}//main

}//class
