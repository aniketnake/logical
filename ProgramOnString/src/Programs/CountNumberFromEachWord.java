package Programs;

import java.util.Scanner;

public class CountNumberFromEachWord {
	/**
	 * Count the character within the particular word
	 * 
	 * @param str
	 */
	static void count(String str) {
		// toCharString() count string into sequence of character
		char[] ch = str.toCharArray();
		// count the length
		for (int i = 0; i < ch.length; i++) {
			String s = "";
			// check the condition given string is within the range and it should not
			// contain whitespace
			while (i < ch.length && ch[i] != ' ') {
				s = s + ch[i];
				i++;
			}
			// output
			if (s.length() > 0) {
				System.out.println(s + " " + s.length());
			}
		}
	}

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter String");
		String str = src.nextLine();
		count(str);
	}

}
