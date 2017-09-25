package Array;

import java.util.Scanner;

public class the_largest_array {
	public static void main(String args[])
	{
		int x[] = new int [3];
		int i,q,temp;
		
		System.out.println("Enter the value of each element");
		Scanner s = new Scanner(System.in);
		for(i = 0 ;i<3;i++)
		{
			x[i]= s.nextInt();
		}
		
		temp = x[0];
		
		for(i = 0;i<3;i++)
		{
			if (x[i]>=temp)
			{
				temp=x[i];
			}
		}
		System.out.println("The largest array is ");
		for(i=0;i<3;i++)
		{
			System.out.println(temp);
		}
	}

}
