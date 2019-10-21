package Programs;

import java.util.Scanner;

public class Palindrome {
	/**
	 * the given program is to find the given string is palindrome or not 
	 * @param str1
	 */
	
	public static void checkPalindrome(String str1) {
		String reverse = new StringBuffer(str1).reverse().toString();
		if (str1.equals(reverse)) {
			System.out.println("the given string is palindrome");
		} else {
			System.out.println("the given string is not palindrome");
		}
	}

	/**public static void main(String[] args) {
		checkPalindrome("abba");
		checkPalindrome("abbc");
	}
}
**/
	
	public static void main(String[] args) {
		Scanner src =new Scanner(System.in);
		System.out.println("Enter String");
		String str1= src.next();
		checkPalindrome(str1);
	}
}