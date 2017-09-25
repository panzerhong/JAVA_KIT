package Array;

import java.util.Scanner;

public class return_true_false {

	public static void main(String args[])
	{
		int x[] = new int[100];
		int i,q,y=0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the quantity of array");
		q= s.nextInt();
		System.out.println("Enter the value of array ");
		for(i = 1;i<=q;i++){
			x[i] = s.nextInt();
		}
		
		for(i=1;i<=q;i++)
		{
			if(x[i]==2||x[i]==3)
			{
				System.out.println("True");
				break;
			}
			else
			{
				y++;
			}
		}
		
		if(y==q)
			System.out.println("False");
	}
}
