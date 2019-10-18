package Oct_thirteen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * this is program is for separate the even odd number
 * 
 * @author aniketnake
 *
 */

public class EvenOddSeparate {

	public static void main(String[] args) {
//		Scanner scr = new Scanner(System.in);
//		System.out.println("Enter number  ");
//		int input = scr.nextInt();
//		int a[] = new int[input];
//
//		// this loop is for which values we want to check it is even or odd
//		for (int i = 0; i < input; i++) {
//			a[i] = scr.nextInt();
//		}//for
		List list = new ArrayList();
		int[] a = {2,3,5,2,7,9};
		
		System.out.println("\n");
		System.out.println("odd numbers ");

		// this loop is for collecting odd values
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				list.add(a[i]);
			}//if
		}//for
		System.out.println("\n");
		System.out.println("Even Numbers");
		// this loop is for collecting even values
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				list.add(a[i]);
			}
		}

	}

}
