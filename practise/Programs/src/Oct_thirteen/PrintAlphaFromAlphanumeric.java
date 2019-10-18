package Oct_thirteen;

import java.util.Scanner;

/**
 * separate only alphabates from the alphanumeric String
 * 
 * @author aniketnake
 *
 */
public class PrintAlphaFromAlphanumeric {

	public static void main(String[] args) {

		Scanner src = new Scanner(System.in);// for user defined values
		System.out.println("Enter Alphanumeric String");
		String input = src.next();

		// replaceAll method is use for accept only those thing which is in regex
		String output = input.replaceAll("[^a-zA-Z]+", "");
		System.out.println(output);

	}

}
