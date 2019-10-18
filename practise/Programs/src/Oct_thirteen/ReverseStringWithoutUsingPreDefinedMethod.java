package Oct_thirteen;

import java.util.Scanner;

/**
 * this is program is for reverse the string without using predefined method
 * 
 * @author aniketnake
 *
 */
public class ReverseStringWithoutUsingPreDefinedMethod {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter String");
		String input = scr.next();
		String reverse = "";// for storing character
		
		// length() count the number of character like in aniket it have 5 char. (0to5)
		// -1 for strat the length in reverse order
		for (int i = input.length() - 1; i >= 0; i--) {
			reverse = reverse + input.charAt(i);// charAt taking one at a time char
		}//for

		System.out.println("Reverse String is::");
		System.out.println(reverse);// output
	}//main

}//class
