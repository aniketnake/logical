package LogicalProgramming;

import java.awt.List;
import java.util.Arrays;
import java.util.Collections;

public class Demo2 {
	/*
	 * static void m1(Integer[] a) { // Collections.reverse(Arrays.asList(a)); //
	 * Collections.sort(java.util.List<T>); // Arrays.sort(a);
	 * 
	 * 
	 * System.out.println(Arrays.asList(a)); }
	 */ 

	public static void main(String[] args) {
		Integer[] a = { 2, 5, 3, 7, 8, 4, 9 };
		int temp = 0;
		int len = a.length;

		for (int i = 0; i < len-1 ; i++) {
			
			  temp = a[i];
			  a[i] = a[len-1];
			  a[len-1] = temp;
			 
		} // for

		for (int i = 0; i < temp; i++) {
			System.out.println(i);
		}
	}

}
