package Programs;

import java.util.Scanner;

public class NumberOfChaeacterInString {
	/**
	 * Find the number for character in string 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter string");
		 String string = scn.next();
	        int count = 0;    
	            
	        //Counts each character except space    
	        for(int i = 0; i < string.length(); i++) {    
	            if(string.charAt(i) != ' ')  {  
	                count++;    
	        }    
	       }     
	        //Displays the total number of characters present in the given string    
	        System.out.println("Total number of characters in a string: " + count);  
	}

}


