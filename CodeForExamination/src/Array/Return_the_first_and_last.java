package Array;

import java.util.Scanner;

public class Return_the_first_and_last {
	public static void main(String[] args) {
		int x[] = new int [100];
		int q,i;
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter the quantity of array");
		q = s.nextInt();
		System.out.println("Enter the value of array");
		for(i = 1;i<=q;i++)
		{
			x[i] = s.nextInt();
		}
		
		System.out.println("The last elemen of array is  "+ x[q]);
		System.out.println("The fist element of array is "+x[0]);
	}

}
