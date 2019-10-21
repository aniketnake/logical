package Programs;

public class FindLCUCSpecialSSpaceDIgitString {

	public static void main(String[] args) {
		/**
		 * find the lowercase, uppercase, special char, space, and number from the
		 * string
		 */
		String str = "nakeaniket06@gmail.com    ABC";

		int lower = 0;
		int upper = 0;
		int number = 0;
		int special = 0;
		int space = 0;
		int s = 0;
		for (int i = 0; i < str.length(); i++) {
			// taking one char form the string
			char ch = str.charAt(i);
			
			if (ch >= 'A' && ch <= 'Z') {// Upper Case
				upper++;
			} else if (ch >= 'a' && ch <= 'z') {// Lower Case
				lower++;
			} else if (ch >= '0' && ch <= '9') {// Nnumber
				number++;
			} else if (ch == ' ') {// space
				space++;
			} else if (ch == str.length()) {// String
				s++;
			} else {// special char
				special++;
			}

		}//for
		System.out.println("Lowercase letters : " + lower);
		System.out.println("Uppercase letters : " + upper);
		System.out.println("Number : " + number);
		System.out.println("Special characters : " + special);
		System.out.println("space : " + space);
		System.out.println("String : " + s);
	}//main

}//class
