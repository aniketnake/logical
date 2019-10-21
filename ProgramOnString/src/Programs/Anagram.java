package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	/**
	 * find the string is anagram or not
	 * 
	 * @param str1
	 * @param str2
	 */

	static void checkAnagram(String str1, String str2) {
		String s1 = str1;
		String s2 = str2;

		boolean check = true;
		// Compare two string
		if (s1.length() != s2.length()) {
			check = false;
		} else {// toLowerCase method is use for convert all character in lower case
			// toCharArray convert String into sequence of character
			char[] ch1 = s1.toLowerCase().toCharArray();
			char[] ch2 = s2.toLowerCase().toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);
			// Compare to string
			check = Arrays.equals(ch1, ch2);

		} // else
		if (check) {
			System.out.println("the string " + s1 + " and " + s2 + " is anagram");
		} else {
			System.out.println("the string " + s1 + " and " + s2 + " is not anagram");
		} // else

	}// main
/**
 * this is for fix value
 */
	/**public static void main(String[] args) {
		// static method call
		checkAnagram("Aniket", "tneiak");
		checkAnagram("keep", "pek");
	}// main

}// class
**/
	
	/**
	 * this is for user defined value
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner src =new Scanner(System.in);
		System.out.println("Enter your first String");
		String str1 = src.nextLine();
		System.out.println("Enter your second string");
		String str2=src.nextLine();
		checkAnagram(str1,str2);
	}
}
