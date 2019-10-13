package LogicalProgramming;

import java.util.Scanner;

public class Sum1ton {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number");
		int a = scn.nextInt();
		int b = 0;
		
		for(int i=0;i<=a;i++) {
			b=b+i;
			
		}
		System.out.println(b);
	}

}
