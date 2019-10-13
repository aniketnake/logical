package LogicalProgramming;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number");
		int a = scn.nextInt();

		if (a == 0||a<=0) {
			System.out.println("not allowed");
			
		}

		else if (a % 2 == 0) {
			System.out.println("The Given Number IS Even");
		} else {
			System.out.println("The Given Number IS Odd");
		}

	}

}
