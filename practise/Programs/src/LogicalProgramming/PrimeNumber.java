package LogicalProgramming;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number");

		int a = scn.nextInt();
		System.out.println("Enter upto number");
		int b = scn.nextInt();
		int temp = 0;

		for (int j = 1; j <= a; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.println(b);

				if (j % i == 0) {
					temp++;
				}
			}
		}
		if (temp == 2) {
			System.out.println("no is prime");
		} else {
			System.out.println("no is not prime");
		}

	}

}
