package LogicalProgramming;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
	//	int n = 0;

		int fact = 1;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number");
		int x = scn.nextInt();

		// logic
		/*if (n < 0) {
			System.out.println("number should not be negitive");
		}else {*/
			for (int c = 1; c <= x; c++)
				fact = fact * c;
		
			System.out.println("factorial of" + x + "is" + fact);

		
	}

}
