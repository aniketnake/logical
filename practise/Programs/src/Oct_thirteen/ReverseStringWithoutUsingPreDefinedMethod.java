package Oct_thirteen;

import java.util.Scanner;

public class ReverseStringWithoutUsingPreDefinedMethod {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter String");
		String input = scr.next();
		String reverse = "";

		for (int i = input.length()-1; i >= 0; i--) {
			reverse = reverse + input.charAt(i);
		}
		System.out.println("Reverse String is::");
		System.out.println(reverse);
	}

}
