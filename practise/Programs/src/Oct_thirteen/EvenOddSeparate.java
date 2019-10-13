package Oct_thirteen;

import java.util.Scanner;

public class EvenOddSeparate {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter number  ");
		int input = scr.nextInt();
		int a[] = new int[input];
		for (int i = 0; i < input; i++) {
			a[i] = scr.nextInt();
		}
		System.out.println("\n");
		System.out.println("odd numbers ");

		for (int i = 0; i < input; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("\n");
		System.out.println("Even Numbers");
		for (int i = 0; i < input; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}

	}

}
