package Array;

import java.util.Scanner;
import java.util.*;

public class Return_the_middle_element {
	public static void main(String args[])
	{
		int x [ ] = new int [100];
		int y[] = new int [100];
		int i = 0,q,r,a = 0,b=0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the quantity of array of 1st array");
		q = s.nextInt();
		if(q%2==0)
		{
			System.out.println("There is no middle element in the first array"); 
			a = 0;
		}
		else
		{
			System.out.println("Enter the value of array 1st array");
			for(i = 1 ;i<=q;i++)
			{
				x[i] = s.nextInt();
				if(i ==(q-1)/2+1)
				{
					a =x[i];
				}
				
			}
		}
		
		
		System.out.println("Enter the quantity of 2nd array");
		r = s.nextInt();
		if(r%2 == 0)
		{
			System.out.println("There is no middle element in the first array");
			b = 0;
		}
			else
			{System.out.println("Enter the value of 2nd array");
				for(i = 1;i<=r;i++)
				{
					y[i]=s.nextInt();
					if(i==(r-1)/2+1)
					{
						b = y[i];
					}
						
				}
			}
				
			if(a==0&&b==0)
			{
				System.out.println("Both of the array has no middle value");
			}
			else
			{
				System.out.println("The middle array for both are "+ a+" "+b);
			}
		
	}


}
