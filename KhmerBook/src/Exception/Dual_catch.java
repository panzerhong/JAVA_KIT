package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dual_catch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num [] = new int [7];
		int k = 5;
		try
		{
			for(int j = 0;j<9;j++)
			{
				System.out.println("Input integer number");
				num[j]= s.nextInt();
				try
				{
					double result = num[j]/k;
					System.out.println("After dividing by k"+result);
					k--;
				}catch(ArithmeticException e2)
				{
					System.out.println("Cannot divide by zero");
					e2.printStackTrace();
				}
				
			}
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Input Array out of Bound");
		}catch(InputMismatchException e1)
		{
			System.out.println("Wrong input sir, Allowed only integer");
		}
	}

}
