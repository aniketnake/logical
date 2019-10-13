package Oct_thirteen;

import java.util.Scanner;

public class SumFromAlphaNumeric {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the alphanumeric String::");
		String input = scr.next();

		int sum = 0;
		// String num = "";

		for (int i = 0; i < input.length(); i++) {
			// character is a class in which isDigit method i was found
			// isDigit check the given character is digit or not
			if (Character.isDigit(input.charAt(i))) {
				//parseInt method is use to convert string to int
				sum = sum + Integer.parseInt(input.charAt(i) + "");
			}
		}

		System.out.println(sum);
	}

}
