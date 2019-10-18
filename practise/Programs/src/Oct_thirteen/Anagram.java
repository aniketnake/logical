package Oct_thirteen;

import java.util.Arrays;

public class Anagram {

	static void checkAnagram(String str1, String str2) {
		String s1 = str1.replaceAll("\\s+", "");
		String s2 = str2.replaceAll("\\s+", "");

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
			System.out.println("the string" + s1 + " and " + s2 + "is anagram");
		} else {
			System.out.println("the string" + s1 + " and " + s2 + "is not anagram");
		} // else

	}// main

	public static void main(String[] args) {
		// static method call
		checkAnagram("aniket", "tneiak");
		checkAnagram("keep", "pek");
	}// main

}// class
