package Array;

import java.util.Scanner;

public class Sum_first_2_element {
	public static void main(String[] args) {
		
		int x [] = new int[100];
		int q,i,sum;
		System.out.println("Enter the quantity of array");
		Scanner s = new Scanner(System.in);
		
		q = s.nextInt();
		System.out.println("Enter the value of array");
		for(i = 1;i<=q;i++)
		{
			x[i] = s.nextInt();
		}
		
		sum = x[1]+x[2];
		
		System.out.println("The sum of the first 2 element array is  "+ sum);
	}
	
	
}
